package co.chatsdk.ui.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

// 맞춤법 교정용 API (retrofit 사용)
public interface SpellCheckAPI {

    // query를 넣어주면 해당 문자열을 맞춤법에 맞게 교정하도록 네이버에 요청
    @GET("p/csearch/ocontent/util/SpellerProxy?color_blindness=0")
    Call<ResponseBody> Speller(@Query("q") String query);

    // retrofit 객체 (네이버 맞춤법 검사 URL에 맞게 생성)
    Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl("https://m.search.naver.com/")
                            .build();
}
