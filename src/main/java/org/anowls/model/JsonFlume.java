package org.anowls.model;

import java.util.Date;

/**
 * Created by anowls on 2017/7/13.
 */
public class JsonFlume {

    private Header header;
    private String body;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    class Header {
        private String key;
        private Date date;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }
}
