package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* renamed from: X.8fa  reason: invalid class name and case insensitive filesystem */
public final class C361048fa implements C276444tL {
    public Boolean A00;
    public String A01;
    public final JsonToken A02;

    public final boolean ADz() {
        Boolean bool = this.A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("type mis matching");
        sb.append(this.A02);
        throw new IOException(sb.toString());
    }

    public final int CNd() {
        String str = this.A01;
        if (str != null) {
            return Integer.valueOf(str).intValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("type mis matching");
        sb.append(this.A02);
        throw new IOException(sb.toString());
    }

    public final long ClN() {
        String str = this.A01;
        if (str != null) {
            return Long.valueOf(str).longValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("type mis matching");
        sb.append(this.A02);
        throw new IOException(sb.toString());
    }

    public final Number CsM() {
        String str = this.A01;
        if (str != null) {
            try {
                return Long.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(str);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("type mis matching");
            sb.append(this.A02);
            throw new IOException(sb.toString());
        }
    }

    public final String Eyf() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("type mis matching");
        sb.append(this.A02);
        throw new IOException(sb.toString());
    }

    public final boolean isNull() {
        if (this.A02 == JsonToken.NULL) {
            return true;
        }
        return false;
    }

    public C361048fa(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        this.A02 = peek;
        int i = C361058fb.A00[peek.ordinal()];
        if (i == 1) {
            this.A00 = Boolean.valueOf(jsonReader.nextBoolean());
        } else if (i == 2) {
            jsonReader.nextNull();
        } else if (i == 3 || i == 4) {
            this.A01 = jsonReader.nextString();
        } else {
            throw new IllegalStateException("can't read value");
        }
    }
}
