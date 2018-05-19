package com.example.administrator.okhttpdemo.retrofit;

import java.util.List;

/**
 * Created by Administrator on 2018/5/19.
 */

public class TodayNewsBean {

    /**
     * message : success
     * data : [{"content":"{\"abstract\":\"我喜欢吃饭\",\"action_extra\":\"{\\\"channel_id\\\": 3189398972}\",\"action_list\":[{\"action\":1,\"desc\":\"\",\"extra\":{}},{\"action\":3,\"desc\":\"\",\"extra\":{}},{\"action\":7,\"desc\":\"\",\"extra\":{}},{\"action\":9,\"desc\":\"\",\"extra\":{}}],\"aggr_type\":1,\"allow_download\":false,\"article_sub_type\":0,\"article_type\":0,\"article_url\":\"https://www.wukong.com/question/6556553086926586116\",\"ban_comment\":0,\"behot_time\":1526698881,\"bury_count\":0,\"cell_flag\":262155,\"cell_layout_style\":1,\"cell_type\":0,\"comment_count\":0,\"content_decoration\":\"\",\"cursor\":1526698881000,\"digg_count\":0,\"display_url\":\"https://www.wukong.com/question/6556553086926586116\",\"filter_words\":[{\"id\":\"8:0\",\"is_selected\":false,\"name\":\"看过了\"},{\"id\":\"9:1\",\"is_selected\":false,\"name\":\"内容太水\"},{\"id\":\"5:2302601335\",\"is_selected\":false,\"name\":\"拉黑作者:电影故事那些事\"},{\"id\":\"6:1013515\",\"is_selected\":false,\"name\":\"不想看:范丞丞\"},{\"id\":\"6:162366333\",\"is_selected\":false,\"name\":\"不想看:蔡徐坤\"}],\"forward_info\":{\"forward_count\":0},\"group_id\":6556576378177716493,\"has_m3u8_video\":false,\"has_mp4_video\":0,\"has_video\":false,\"hot\":0,\"ignore_web_transform\":1,\"is_subject\":false,\"item_id\":6556576378177716493,\"item_version\":0,\"level\":0,\"log_pb\":{\"impr_id\":\"2018051911012101001502405089043B\"},\"need_client_impr_recycle\":1,\"publish_time\":1526571900,\"read_count\":1,\"rid\":\"2018051911012101001502405089043B\",\"share_count\":0,\"share_info\":{\"cover_image\":null,\"description\":null,\"share_type\":{\"pyq\":2,\"qq\":0,\"qzone\":0,\"wx\":0},\"share_url\":\"http://m.toutiao.com/group/6556576378177716493/?iid=0\\u0026app=news_article\",\"title\":\"你们喜欢范丞丞还是蔡徐坤呢？为什么？\"},\"share_url\":\"http://m.toutiao.com/group/6556576378177716493/?iid=0\\u0026app=news_article\",\"show_dislike\":true,\"show_portrait\":false,\"show_portrait_article\":false,\"source\":\"电影故事那些事\",\"source_avatar\":\"http://p9.pstatp.com/thumb/71a400028b803c2cd601\",\"source_icon_style\":4,\"tag\":\"news_entertainment\",\"tag_id\":6556576378177716493,\"tip\":0,\"title\":\"你们喜欢范丞丞还是蔡徐坤呢？为什么？\",\"ugc_recommend\":{\"activity\":\"\",\"reason\":\"\"},\"url\":\"https://www.wukong.com/question/6556553086926586116\",\"user_info\":{\"avatar_url\":\"http://p9.pstatp.com/thumb/71a400028b803c2cd601\",\"description\":\"为您分享天上地下，天涯海角，天南地北的一些小故事，小趣事\",\"follow\":false,\"follower_count\":0,\"name\":\"电影故事那些事\",\"user_id\":52221312521,\"user_verified\":false},\"user_repin\":0,\"user_verified\":0,\"verified_content\":\"\",\"video_style\":0}","code":""}]
     * total_number : 1
     * has_more : true
     * login_status : 0
     * show_et_status : 0
     * post_content_hint : 分享今日新鲜事
     * has_more_to_refresh : true
     * action_to_last_stick : 0
     * feed_flag : 0
     * tips : {"type":"app","display_duration":2,"display_info":"今日头条推荐引擎有1条更新","display_template":"今日头条推荐引擎有%s条更新","open_url":"","web_url":"","download_url":"","app_name":"今日头条","package_name":""}
     */

    private String message;
    private int total_number;
    private boolean has_more;
    private int login_status;
    private int show_et_status;
    private String post_content_hint;
    private boolean has_more_to_refresh;
    private int action_to_last_stick;
    private int feed_flag;
    private TipsBean tips;
    private List<DataBean> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotal_number() {
        return total_number;
    }

    public void setTotal_number(int total_number) {
        this.total_number = total_number;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public int getLogin_status() {
        return login_status;
    }

    public void setLogin_status(int login_status) {
        this.login_status = login_status;
    }

    public int getShow_et_status() {
        return show_et_status;
    }

    public void setShow_et_status(int show_et_status) {
        this.show_et_status = show_et_status;
    }

    public String getPost_content_hint() {
        return post_content_hint;
    }

    public void setPost_content_hint(String post_content_hint) {
        this.post_content_hint = post_content_hint;
    }

    public boolean isHas_more_to_refresh() {
        return has_more_to_refresh;
    }

    public void setHas_more_to_refresh(boolean has_more_to_refresh) {
        this.has_more_to_refresh = has_more_to_refresh;
    }

    public int getAction_to_last_stick() {
        return action_to_last_stick;
    }

    public void setAction_to_last_stick(int action_to_last_stick) {
        this.action_to_last_stick = action_to_last_stick;
    }

    public int getFeed_flag() {
        return feed_flag;
    }

    public void setFeed_flag(int feed_flag) {
        this.feed_flag = feed_flag;
    }

    public TipsBean getTips() {
        return tips;
    }

    public void setTips(TipsBean tips) {
        this.tips = tips;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class TipsBean {
        /**
         * type : app
         * display_duration : 2
         * display_info : 今日头条推荐引擎有1条更新
         * display_template : 今日头条推荐引擎有%s条更新
         * open_url :
         * web_url :
         * download_url :
         * app_name : 今日头条
         * package_name :
         */

        private String type;
        private int display_duration;
        private String display_info;
        private String display_template;
        private String open_url;
        private String web_url;
        private String download_url;
        private String app_name;
        private String package_name;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getDisplay_duration() {
            return display_duration;
        }

        public void setDisplay_duration(int display_duration) {
            this.display_duration = display_duration;
        }

        public String getDisplay_info() {
            return display_info;
        }

        public void setDisplay_info(String display_info) {
            this.display_info = display_info;
        }

        public String getDisplay_template() {
            return display_template;
        }

        public void setDisplay_template(String display_template) {
            this.display_template = display_template;
        }

        public String getOpen_url() {
            return open_url;
        }

        public void setOpen_url(String open_url) {
            this.open_url = open_url;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }

        public String getDownload_url() {
            return download_url;
        }

        public void setDownload_url(String download_url) {
            this.download_url = download_url;
        }

        public String getApp_name() {
            return app_name;
        }

        public void setApp_name(String app_name) {
            this.app_name = app_name;
        }

        public String getPackage_name() {
            return package_name;
        }

        public void setPackage_name(String package_name) {
            this.package_name = package_name;
        }
    }

    public static class DataBean {
        /**
         * content : {"abstract":"我喜欢吃饭","action_extra":"{\"channel_id\": 3189398972}","action_list":[{"action":1,"desc":"","extra":{}},{"action":3,"desc":"","extra":{}},{"action":7,"desc":"","extra":{}},{"action":9,"desc":"","extra":{}}],"aggr_type":1,"allow_download":false,"article_sub_type":0,"article_type":0,"article_url":"https://www.wukong.com/question/6556553086926586116","ban_comment":0,"behot_time":1526698881,"bury_count":0,"cell_flag":262155,"cell_layout_style":1,"cell_type":0,"comment_count":0,"content_decoration":"","cursor":1526698881000,"digg_count":0,"display_url":"https://www.wukong.com/question/6556553086926586116","filter_words":[{"id":"8:0","is_selected":false,"name":"看过了"},{"id":"9:1","is_selected":false,"name":"内容太水"},{"id":"5:2302601335","is_selected":false,"name":"拉黑作者:电影故事那些事"},{"id":"6:1013515","is_selected":false,"name":"不想看:范丞丞"},{"id":"6:162366333","is_selected":false,"name":"不想看:蔡徐坤"}],"forward_info":{"forward_count":0},"group_id":6556576378177716493,"has_m3u8_video":false,"has_mp4_video":0,"has_video":false,"hot":0,"ignore_web_transform":1,"is_subject":false,"item_id":6556576378177716493,"item_version":0,"level":0,"log_pb":{"impr_id":"2018051911012101001502405089043B"},"need_client_impr_recycle":1,"publish_time":1526571900,"read_count":1,"rid":"2018051911012101001502405089043B","share_count":0,"share_info":{"cover_image":null,"description":null,"share_type":{"pyq":2,"qq":0,"qzone":0,"wx":0},"share_url":"http://m.toutiao.com/group/6556576378177716493/?iid=0\u0026app=news_article","title":"你们喜欢范丞丞还是蔡徐坤呢？为什么？"},"share_url":"http://m.toutiao.com/group/6556576378177716493/?iid=0\u0026app=news_article","show_dislike":true,"show_portrait":false,"show_portrait_article":false,"source":"电影故事那些事","source_avatar":"http://p9.pstatp.com/thumb/71a400028b803c2cd601","source_icon_style":4,"tag":"news_entertainment","tag_id":6556576378177716493,"tip":0,"title":"你们喜欢范丞丞还是蔡徐坤呢？为什么？","ugc_recommend":{"activity":"","reason":""},"url":"https://www.wukong.com/question/6556553086926586116","user_info":{"avatar_url":"http://p9.pstatp.com/thumb/71a400028b803c2cd601","description":"为您分享天上地下，天涯海角，天南地北的一些小故事，小趣事","follow":false,"follower_count":0,"name":"电影故事那些事","user_id":52221312521,"user_verified":false},"user_repin":0,"user_verified":0,"verified_content":"","video_style":0}
         * code :
         */

        private String content;
        private String code;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}
