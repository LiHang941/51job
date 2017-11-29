package xyz.lihang.utils.job.service;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

@Deprecated
public interface JobHtmlService {

    @GET("/jobsearch/search_result.php")
    Call<ResponseBody> jobhtml(@QueryMap Map<String,Object> map, @Query("curr_page") Integer curr_page);

}
