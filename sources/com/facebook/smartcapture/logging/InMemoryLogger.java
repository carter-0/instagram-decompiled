package com.facebook.smartcapture.logging;

import X.0qQ;
import X.AnonymousClass7TG;
import X.DbS;
import X.DbT;
import X.Pxe;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class InMemoryLogger {
    public JSONArray log;
    public final SmartCaptureLogger logger;
    public final long referenceTime;
    public final TimestampProvider timestamp;

    public final class LogEntryBuilder {
        public final RoundingMode TIMESTAMP_ROUNDING_MODE;
        public final int TIMESTAMP_SCALE = 3;
        public final String event;
        public final JSONObject json;
        public final /* synthetic */ InMemoryLogger this$0;

        public LogEntryBuilder(InMemoryLogger inMemoryLogger, String str, float f) {
            0qQ.A0B(str, 2);
            this.this$0 = inMemoryLogger;
            this.event = str;
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            this.TIMESTAMP_ROUNDING_MODE = roundingMode;
            JSONObject A11 = DbS.A11();
            this.json = A11;
            try {
                A11.put(str, BigDecimal.valueOf((double) f).setScale(3, roundingMode));
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
            }
        }

        public final LogEntryBuilder put(String str, int i) {
            0qQ.A0B(str, 0);
            try {
                this.json.put(str, i);
                return this;
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
                return this;
            }
        }

        public final void submit() {
            this.this$0.logJson(this.json);
        }

        public final LogEntryBuilder put(String str, Object obj) {
            0qQ.A0B(str, 0);
            try {
                this.json.put(str, obj);
                return this;
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
                return this;
            }
        }

        public final LogEntryBuilder put(String str, String str2) {
            0qQ.A0B(str, 0);
            try {
                this.json.put(str, str2);
                return this;
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
                return this;
            }
        }

        public final LogEntryBuilder put(String str, boolean z) {
            0qQ.A0B(str, 0);
            try {
                this.json.put(str, z);
                return this;
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
                return this;
            }
        }
    }

    public final LogEntryBuilder addEntry(String str) {
        0qQ.A0B(str, 0);
        return new LogEntryBuilder(this, str, ((float) (System.currentTimeMillis() - this.referenceTime)) / 1000.0f);
    }

    public final synchronized void clear() {
        this.log = Pxe.A1E();
    }

    public final synchronized void logJson(JSONObject jSONObject) {
        0qQ.A0B(jSONObject, 0);
        this.log.put(jSONObject);
    }

    public final void logJsonError(String str, JSONException jSONException) {
        0qQ.A0B(str, 0);
        this.logger.logError(str, jSONException);
    }

    public synchronized String toString() {
        return DbT.A10(this.log);
    }

    public InMemoryLogger(SmartCaptureLogger smartCaptureLogger, TimestampProvider timestampProvider) {
        AnonymousClass7TG.A1O(smartCaptureLogger, timestampProvider);
        this.log = Pxe.A1E();
        this.timestamp = timestampProvider;
        this.logger = smartCaptureLogger;
        this.referenceTime = System.currentTimeMillis();
    }

    public InMemoryLogger(SmartCaptureLogger smartCaptureLogger) {
        0qQ.A0B(smartCaptureLogger, 1);
        this.log = Pxe.A1E();
        this.timestamp = TimestampProvider.INSTANCE;
        this.logger = smartCaptureLogger;
        this.referenceTime = System.currentTimeMillis();
    }
}
