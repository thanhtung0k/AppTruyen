package com.thanhtungotb.appdoctruyen;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class StoryListActivity extends AppCompatActivity {

    private RecyclerView rvStoryList;
    private Context context;
    private StoryAdapter storyAdapter;
    private List<Story> stories;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_list);
        init();
        stories = generateStudent();
        storyAdapter = new StoryAdapter(StoryListActivity.this,stories);
        rvStoryList.setAdapter(storyAdapter);
        storyAdapter.setOnItemClickListener(new StoryAdapter.onItemClickListener() {
            @Override
            public void onItemClicked(int position) {
                Intent intent = new Intent(StoryListActivity.this,StoryDetailActivity.class);
                Story story = new Story();
                story.setTentruyen(String.valueOf(stories.get(position).getTentruyen()));
                story.setTentacgia(String.valueOf(stories.get(position).getTentacgia()));
                story.setNgaycapnhap(String.valueOf(stories.get(position).getNgaycapnhap()));
                story.setTheloai(String.valueOf(stories.get(position).getTheloai()));
                story.setTrangthai(String.valueOf(stories.get(position).getTrangthai()));
                story.setSochuong(String.valueOf(stories.get(position).getSochuong()));
                story.setNgayup(String.valueOf(stories.get(position).getNgayup()));
                story.setNoidung(String.valueOf(stories.get(position).getNoidung()));
                story.setPhoto(Integer.valueOf(stories.get(position).getPhoto()));
                intent.putExtra("key",story);
                startActivity(intent);
            }
        });
    }
    private void init(){
        rvStoryList = findViewById(R.id.rvAppDocTruyen);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvStoryList.setLayoutManager(llm);
    }
    private List<Story> generateStudent(){
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(rvStoryList.getContext(), DividerItemDecoration.VERTICAL);
        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.divider);//2 tham số 1 màn hình hiện tại mình đang đứng,2 llayout của mình
        dividerItemDecoration.setDrawable(drawable);
        rvStoryList.addItemDecoration(dividerItemDecoration);
        List<Story> stories = new ArrayList<>();
        stories.add(new Story("Sứ Mệnh Hoàng Đạo(12 Chòm Sao)", "Tác Giả :scor scor", "\" Đất nước này đã được bình yên theo ước muốn của ngươi nhưng ... mối đoe dọa của nó vẫn còn - là ta đây . Chắc ngươi cũng biết rằng ko nên để nữ quỷ tồn tại chứ ... giờ ta ko còn sức phản kháng rồi , mau ... giết ... ta đi ...\" Cô gằn từng chữ như muốn hắn phải khắc thật sâu điều này ..........\" Khi tôi tìm được em thì đừng mong mà chạy trốn khỏi tôi nữa nhé , nữ quỷ của tôi .\"---------------------------\" Ko có ta .... hãy nhớ cười thật nhiều nhé ...ta mong nàng ...hạnh phúc nha ...'......Nàng ôm lọ hài cốt ấy vào lòng mặc cho cái nóng từ bảo thạch phát ra đốt nóng da thịt trắng hồng của nàng .Mọi người hoảng hốt trước việc làm của nàng của nàng ko thôi .\" Lúc trước , ngươi bà đạo mang ta đi , giờ ta mang ngươi đi , đừng mong mà phản kháng nha \"---------------------' Tại sao em lại khóc ? là do ta sao ? Nếu như ta ko nghe thấy giọng hát ấy . Gía như ta ko gặp đc em thì tốt biết mấy và .... em sẽ ko đau khổ khi bên ta ....\"Hắn có thể làm mọi điều hắn muốn nhưng việc hắn ko bao giờ làm đc là .... ko làm nàng phải khóc ........\" Ngươi ko hề yêu ta , bên ta ngươi ko hạnh phúc . Nếu đc thì ta sẽ nguyện là người ngoài cuộc trong cuộc đời ngươi .... chỉ mong đc nhìn thấy ... nụ cười thật sự yên bình của ngươi \"----------------\" Ngay từ đầu ngươi đã ko hề yêu ta ... và những việc ngươi làm với ta cũng vậy ... ngươi chỉ vẫn sẽ mãi là 1 kẻ ích kỉ chỉ yêu riêng bản thân ngươi ,à thôi ..... \"Nàng thật ko chịu đc những gì hắn đã làm với nàng ...... hắn thật ích kỉ..........\" Ta ko phải người thường nên ...phải yêu theo cách của ta mới là ta . Chỉ cần giữ nàng ở bên ta ... ta chấp nhận cho cái giá của việc đó là nàng hận ta ...\"---------------Cô mong manh còn hơn vải lụa , thế nhưng lại có can đảm giương kiếm về phía hắn , nhìn hắn bằng ánh mắt câm hận :\" Hãy dừng ngay lại cái việc làm độc ác này ..... nếu ko thì đừng trách ta .........\" Thật là 1 cô gái nhỏ mạnh mẽ a \"--------------\" Việc sống nay chết mai trên xa trường là chuyện thường tình . Với cái mạng nhỏ nhoi này mà giúp cho mọi người hạnh phúc ta cũng cam lòng . Hãy sống thay .... cho phần của ta nhé . Tạm biệt .\"Nàng mĩm cười nhẹ nhìn hắn , thời khắc mà gươm giáo xuyên thủng nàng , hắn cảm thấy thế giới của ngày mai trong mắt hắn ....ĐÃ CHẾT \" Ta sống vì nàng . Đến mạng sống này cũng vì nàng mà sống . XIN LỖI , ta ko thể sống thay ... cho 1 người đã chết đâu \""
                , "Ngày Cập Nhập :2017-06-03 21:52:52", "Thể Loại :Ngôn Tình, Truyện Teen", "Trạng Thái :Đang Cập Nhập", "Số Chương :599",
                "Ngày Up :2016-11-22 15:22:54",R.drawable.chomsao));
        stories.add(new Story("Đồ Ngốc, Anh Yêu Em", "Tác Giả :Mèo Mun", "Reeng..reeng_ Chiếc đồng hồ báo thức ngay đầu giường của nó kêu lên, nó trườn mình trong cái chăn thân yêu như không muốn dậy nhưng nó phải dậy thôi vì nó còn phải đứng lên để chống trả cái thế giới mục nát này nữa mà. Nó ngồi dậy, làm VSCN xong, nó bước ra với bộ đồng phục quen thuộc của lớp S.A1 trường Sao Mai. Nó mặc chiếc áo sơ mi màu trắng với chiếc áo len cụt tay màu kem, chiếc váy caro màu đen-đỏ và chiếc áo khoác ngoài cùng màu, trên ngực có huy hiệu của lớp S.A và đôi tất dài màu đen với chiếc balo có hình con mèo cùng màu, nó lôi bộ dụng cụ trang điểm của nó ra rồi \"tân trang nhan sắc\" lại cho mình mái tóc màu nâu hạt dẻ được nó cột cao lên. Nó bước xuống nhà với bao cái nhìn khinh bỉ của m.n trong gia đình - Thưa ba, thưa dì con đi học !_ Nó bước vào phòng khách rồi cúi đầu cung kính chào người mà nó gọi là \"ba\"và người vợ của ba nó-bà Vân\n" + "\n" + "- Đi,đi_Ông phong không thèm nhìn nó 1 cái nào \n" + "\n" + "- Đi đi dùm cái, chướng hết cả mắt _ BÀ Vân đưa tay đẩy nó ra\n" + "\n" + "Nó không nói gì, chỉ lẳng lặng ra ngoài. Ở ngoài cửa lúc nàocũng có cô đứng đợi nó đi học\n" + "\n" + "- Nhanh lên nào, mày chậm quá đấy, trễ 5 phút rồi này_ Cô càu nhàu nó. Cô mặc đồng phục giống nó và chiếc balo màu kem với đôi giày bata trắng cặp với nó. Mái tóc màu đen huyền được cô buông thả, gương mặt xinh đẹp không 1 chút son phấn\n" + "\n" + "- Biết rồi, biết rồi_ Nó mang vội đôi giầy bata màu trắng rồi chạy đến chỗ cô\n" + "\n" + "- Biết rồi thì nhanh lên _ Cô cau mày trông cực dễ thương\n" + "\n" + "- Rồi rồi. Đi thôi _ Nó đẩy nhẹ cô lên phía trước\n" + "\n" + "* Trường Sao Mai\n" + "\n" + "Nó vs cô đến trường thì bao ánh mắt nhìn về phía cô. trong mắt họ, cô như thiên thần đi chung với 1 con vật xấu xí (nó) vậy\n" + "\n" + "- Nhi tiểu thư ! Chào buổi sáng _ 1 hàng đầy đủ những chàng trai, cô gái cúi chào cô nhưng tất cả đều bị cô xem như không khí\n" + "\n" + "- Lên lớp thôi My _ Cô cầm tay nó lướt qua những con người giả tạo ở đó\n" + "\n" + "- Mày được nhiều người hâm mộ ghê nhỉ ? _ Nó chạy theo cô\n" + "\n" + "- Để tâm làm gì cái lũ giả tạo đó _ Cô nói\n" + "\n" + "- Ừm!_ Nó gật đầu\n" + "\n" + "Nó kéo cánh cửa lớp ra thì có 1 xô nước từ góc cửa đổ xuống ướt hết người nó\n" + "\n" + "- My! ko sao chứ ?_ Nhi chạy lại chỗ nó nói\n" + "\n" + "- Hả? Ừ ko sao _ Nó cười nhẹ\n" + "\n" + "- Dính ngay 1 phát luôn Hahaha _1 hs nào đó trong lớp nói khiến cả lớp rộ lên những tiếng cười\n" + "\n" + "- Im hết ngay cho tôi _ Cô hét khiến cả lớp im bặt\n" + "\n" + "- Ko sao chứ My_ Anh chạy lại đỡ nó lên\n" + "\n" + "- Ừ ừ ko sao,ko sao_ Nó nói\n" + "\n" + "- Ko sao cái j, ướt hết rồi kìa_Cô nói\n" + "\n" + "- Ko sao mà _ Nó xua tay\n" + "\n" + "- Nhi tiểu thư à ! Tại sao em lại chơi chung với con nhỏ xấu xí này chứ, thật uổng phí mà _ 1 tên con trai từ đâu tới chen mỏ vào \n" + "\n" + "- Tôi chơi với ai là quyền của tôi, sao anh phải bận tâm nhỉ? _ Cô khinh bỉ nhìn tên đó\n" + "\n" + "- Anh thích thì anh quan tâm thôi, ko được sao ?_ Tên đó nói\n" + "\n" + "- Mặc kệ anh _ Cô quay mặt đi\n" + "\n" + "- Nhi tiểu thư à ! em Xinh đẹp như vậy thì chi bằng đi chơi chung với bọn anh nhé _ Tên đó nói\n" + "\n" + "- Lớp trưởng à! Trường mình mới nuôi chó hay sao mà nghe tiếng sủa ấy nhỉ _ Cô nói móc tên đó\n" + "\n" + "- Con nhỏ này... _ Tên đó chưa nói hết câu thì nó chen vào\n" + "\n" + "- Được rồi, tớ ko sao mà, tớ vào nhà vệ sinh chút nhé _ Nó nói rồi chạy thật nhanh vào nhà vệ sinh để ko muốn cô biết rằng nó đang khóc\n" + "\n" + "Nó chạy ra ngoài hành lang thì va phải 1 người mà ko nên đụng vào khiến 2 người ngã ngửa ra sau ( vì bất ngờ nên mới bị té)\n" + "\n" + "- Xin lỗi, thật sự xin lỗi bạn _ Nó cúi đầu cung kính rồi chạy vào nhà vệ sinh\n" + "\n" + "* Nhà vệ sinh nữ\n" + "\n" + "- Mình lại yếu đuối nữa rồi, như vậy làm sao có thể đứng lên chống lại thế giới này cơ chứ _ Nó nói nhỏ, 2 hàng nước chảy dài trên khuôn mặt nó. Nó xả nước, dòng nước mát lạnh chảy qua khuôn mặt nó đem theo cả những lớp trang điểm rồi để lộ ra khuôn mặt trắng nõn và xinh đẹp của 1 thiếu nữ mới lớn. Nó tự soi mình trong gương và tự nghĩ thầm rằng ông trời thật ko công bằng với nó. Ông trời ban cho nó sắc đẹp này nhưng lại ko có mẹ bên cạnh quan tâm nó như lúc nhỏ thì nó thà chịu đựng khuôn mặt xấu xí nhưng nó có mẹ. Nó chấp nhận đánh đổi mọi thứ để được ở cạnh mẹ chỉ 1 phút hay 1 giây thôi chỉ cần nhìn thấy khuôn mặt mẹ lúc mẹ cười là đủ lắm rồi"
                , "Ngày Cập Nhập :2017-06-03 21:49:07", "Thể Loại :Ngôn Tình, Truyện Teen", "Trạng Thái :Đang Cập Nhập", "Số Chương :599",
                "Ngày Up :2016-11-22 15:22:54",R.drawable.anhyeuem));
        stories.add(new Story("Cẩu Hoàng Đế, Bổn Cũng Sẽ Ngược Chết Ngươi", "Tác Giả :Thanh Sơn", "Ta vốn là người không sợ bất kỳ thứ gì trên đời, kể cả khi xuyên qua đối mặt với vô vàn âm mưu nơi hậu cung của hắn cũng chưa từng nao núng.\n" + "\n" + "Trước đây mỗi tháng đều nhận được 100 lượng bạc, bây giờ vì cái gì mà không được nhận.\n" + "\n" + "Kẻ vô lại kia, ta nói cho ngươi biết, những ngày tháng sau này của ngươi sẽ không được yên ổn nữa. Ta chính là một thiên tài sát thủ.\n" + "\n" + "Diễn mọi vở kịch chính là thiên phú của ta.\n" + "\n" + "Ngươi muốn ta đọc thơ, ta sẽ đọc những bài thơ của các đại thi hào thế giới \n" + "\n" + "Ngươi muốn ta ca hát, ta có thể hát hay ngất ngây trời xanh, giọng ta có thể nói người nghe người mê, muốn kết ta làm tri kỉ, tào tháo cũng phải nín ỉa khi nghe ta hát \n" + "\n" + "Người muốn ta múa, ta có thể đạp nát Tây Thi, Ngô Chu \n" + "\n" + "Ngươi muốn ta đàn thì không ai có thể cưỡng lại \n" + "\n" + "Còn tài vẽ thì Picasso cũng gọi ta là cụ \n" + "\n" + "Nhan sắc của ta hơn xa Đắc Kỉ, chiêu trò của ta hơn xa Gia Cát Lượng\n" + "\n" + "Bà đây là nhất, nếu như ngươi là một người có lương tâm thì đừng nên đụng vào lương tháng của bà. Không thì bà sẽ cho lương y chăm sóc ngươi.."
                , "Ngày Cập Nhập :2017-06-03 21:38:40", "Thể Loại :Ngôn Tình, Truyện Teen", "Trạng Thái :Đang Cập Nhập", "Số Chương :599",
                "Ngày Up :2016-11-22 15:22:54",R.drawable.hoangde));
        stories.add(new Story("Ác Ma Ca Ca", "Tác Giả :Lãnh Mặc Ngưng Hàng Hương...", "Mẹ cô tái giá với một nam nhân họ Tạ, lần đầu tiên gặp Tạ Thư Dật cô đã bị một cái bạt tai vì gọi hắn là anh hai. Hắn nói rằng mẹ hắn chỉ sinh ra một người con trai là hắn, hắn không có em gái.\n" + "\n" + "Ngày đó cô tám tuổi còn hắn mười ba.\n" + "\n" + "Năm mười tuổi hắn đẩy cô xuống lầu, nói rằng mẹ cô là kẻ thứ ba cướp hạnh phúc của gia đình hắn mới khiến cho mẹ hắn phải chết.\n" + "\n" + "Năm cô mười ba tuổi, vô tình làm đứt dây đàn của hắn, hắn đẩy cô xuống hồ bơi khiến cô suýt chết đuối.\n" + "\n" + "Còn rất nhiều chuyện xảy ra sau đó nhưng Hải Nhạc cô lại chịu sự ức hiếp từ hắn. Vào đêm sinh nhật mười sáu của cô hắn đã tới phòng cô mà cướp đi thứ quý giá nhất của đời con gái. Đó chính là lễ vật mà hắn dành tặng cho cô.\n" + "\n" + "Từ đây cuộc sống của cô mãi mãi bị hắn điều khiển..."
                , "Ngày Cập Nhập :2017-06-03 19:47:44", "Thể Loại :Ngôn Tình, Truyện Teen", "Trạng Thái :Đang Cập Nhập", "Số Chương :599",
                "Ngày Up :2016-11-22 15:22:54",R.drawable.acma));
        stories.add(new Story("Crush Của Tôi Bá Đạo", "Tác Giả :Hạ Tuyết Mẫn", "Nhưng năm tháng đến trường, ai cũng có một người mà, khi được ở bên cạnh người ấy thì vui vẻ, thấy người ấy cười đùa cùng với người khác gì buồn bực. Muốn tỏ tình nhưng lại không đủ dũng khí.\n" +
                "Hứa Diệp Chi cũng vậy, cô luôn thầm thích cậu bạn thanh mai trúc mã cùng lớn lên với mình Dương Tử Lâm , nhưng lại không thể nắm bắt được tâm tình của cậu ấy. Có những lúc cô cảm thấy dường như cậu ấy cũng thích mình, nhưng lại lắm lần thấy cậu ấy thân thiết cùng với cô gái khác. Muốn buông bỏ nhưng lại không thể, liệu mối tình đầu của cô có thể kết quả? Các bạn cùng hãy đón đọc bộ truyện Crush của tôi bá đạo để biết được diễn biến nhé !!!!!"
                , "Ngày Cập Nhập :2017-06-03 19:47:44", "Thể Loại :Ngôn Tình, Truyện Teen", "Trạng Thái :Đang Cập Nhập", "Số Chương :599",
                "Ngày Up :2016-11-22 15:22:54",R.drawable.crushbadao));
        stories.add(new Story("Trái Tim Của Kẻ Sát Nhân", "Tác Giả :Diệp Phi Dạ", "Trong một khu rừng hẻo lánh nọ, có một gia đình quý tộc đã hết thời nhưng họ vẫn nắm một số cổ phần nhỏ của một công ty lớn.\n" + "\n" + "Ông bà Khổng vì chịu sự điều khiển của chủ tịch cũng như lòng tham của bản thân mình mà luôn muốn gả con gái của mình cho con trai độc nhất của chủ tịch Hồ - một kẻ bệnh hoạn có hàng chục vợ.\n" + "\n" + "Hải Băng chính là cô gái phải nhận lấy cuộc hôn nhân đầy dã tâm đấy. Cũng vì thế mà cô bị quản lý vô cùng nghiêm khắc. Khi lên chín tuổi, cô đã thoát khỏi nơi đó và đến sống tại vùng đất khác.\n" + "\n" + "Nhưng số phận hình như không buông tha cô, năm mười sáu tuổi, cô phải trở về căn nhà xưa, tiếp tục chịu đựng quản giáo hà khắc. Cô gái giờ đã trưởng thành, cũng đã thông minh hơn xưa, cô tìm mọi cách để thoát khỏi cuộc hôn nhân đầy dã tâm. Nhưng người duy nhất có thể giúp cô chính là người anh trai bí ẩn - Dương Phong. Người anh trai ấy đồng ý giúp cô thoát khỏi cuộc hôn nhân với một điều kiện khủng khiếp, không một ai có thể ngờ tới. Liệu một cô gái như Hải Băng có đủ mạnh mẽ để vượt qua điều đó? Xin mọi ngườ hãyi đón đọc!!"
                , "Ngày Cập Nhập :2017-06-03 19:47:44", "Thể Loại :Ngôn Tình, Truyện Teen", "Trạng Thái :Đang Cập Nhập", "Số Chương :599",
                "Ngày Up :2016-11-22 15:22:54",R.drawable.satnhan));
        stories.add(new Story("Mạnh Mẽ Yêu Nhau 100 Mgày", "Tác Giả :Diệp Phi Dạ", "Hai tháng sau một lần ngoài ý muốn ngủ cùng nhau, cô mang trong mình dòng máu của anh, anh và cô theo lời cha mẹ mà kết hôn.\n" + "Cô nói: \"Cố tiên sinh, tôi thích đồ ăn nhà hàng này\", ngay ngày hôm sau đầu bếp nhà hàng đã trở thành đầu bếp riêng trong nhà cô.\n" + "Cô nói: \"Cố tiên sinh, tôi thích túi ở cửa hàng này\", ngay đêm đó nhà thiết kế này liền trở thành người thiết kế riêng của cô.\n" + "Những tưởng kết hôn không có tình yêu, cô và anh sẽ giống như trước, nhưng anh lại sủng ái cô đến tận trời. Cô muốn đi làm, anh không đồng ý, cô liền lén tìm việc nhưng cuối cùng do anh sau lưng dở trò quỷ khiến cô không tìm được công việc. Cô tức giận đến tìm anh, anh liền cười híp mắt an bài cho cô một công việc. Ngày hôm sau, cô vui vẻ đi làm lại phát hiện ra bản công việc của mình viết, họ và tên: Tần Chỉ Yêu, chức vụ: Vợ của Cố Dư Sinh"
                , "Ngày Cập Nhập :2017-06-03 19:47:44", "Thể Loại :Ngôn Tình, Truyện Teen", "Trạng Thái :Đang Cập Nhập", "Số Chương :599",
                "Ngày Up :2016-11-22 15:22:54",R.drawable.mottramngay));
        stories.add(new Story("Mạnh Mẽ Yêu Nhau 100 Mgày", "Tác Giả :Diệp Phi Dạ", "Ngôn Tình, Truyện Teen"
                , "Ngày Cập Nhập :2017-06-03 19:47:44", "Thể Loại :Ngôn Tình, Truyện Teen", "Trạng Thái :Đang Cập Nhập", "Số Chương :599",
                "Ngày Up :2016-11-22 15:22:54",R.drawable.mottramngay));
        stories.add(new Story("Mạnh Mẽ Yêu Nhau 100 Mgày", "Tác Giả :Diệp Phi Dạ", "Ngôn Tình, Truyện Teen"
                , "Ngày Cập Nhập :2017-06-03 19:47:44", "Thể Loại :Ngôn Tình, Truyện Teen", "Trạng Thái :Đang Cập Nhập", "Số Chương :599",
                "Ngày Up :2016-11-22 15:22:54",R.drawable.mottramngay));
        stories.add(new Story("Mạnh Mẽ Yêu Nhau 100 Mgày", "Tác Giả :Diệp Phi Dạ", "Ngôn Tình, Truyện Teen"
                , "Ngày Cập Nhập :2017-06-03 19:47:44", "Thể Loại :Ngôn Tình, Truyện Teen", "Trạng Thái :Đang Cập Nhập", "Số Chương :599",
                "Ngày Up :2016-11-22 15:22:54",R.drawable.mottramngay));
        return stories;
    }
}
