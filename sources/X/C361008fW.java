package X;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.8fW  reason: invalid class name and case insensitive filesystem */
public final class C361008fW implements C276424tJ {
    public Integer A00;
    public String A01;
    public C361048fa A02;
    public final JsonReader A03;

    public final Integer Crg() {
        Integer num;
        this.A01 = null;
        this.A02 = null;
        JsonReader jsonReader = this.A03;
        JsonToken peek = jsonReader.peek();
        int[] iArr = C361018fX.A00;
        switch (iArr[peek.ordinal()]) {
            case 1:
                num = AnonymousClass05K.A0Y;
                break;
            case 2:
                num = AnonymousClass05K.A15;
                break;
            case 3:
                num = AnonymousClass05K.A1I;
                break;
            case 4:
                num = AnonymousClass05K.A00;
                break;
            case 5:
                num = AnonymousClass05K.A01;
                break;
            case 6:
                num = AnonymousClass05K.A0C;
                break;
            case 7:
                num = AnonymousClass05K.A0N;
                break;
            case 8:
                num = AnonymousClass05K.A02;
                break;
            case 9:
                num = AnonymousClass05K.A1F;
                break;
            case 10:
                num = AnonymousClass05K.A0j;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknown JsonToken ");
                sb.append(peek);
                throw new IllegalStateException(sb.toString());
        }
        this.A00 = num;
        switch (iArr[jsonReader.peek().ordinal()]) {
            case 1:
                this.A01 = jsonReader.nextName();
                break;
            case 2:
            case 3:
            case 9:
            case 10:
                this.A02 = new C361048fa(jsonReader);
                break;
            case 4:
                jsonReader.beginArray();
                break;
            case 5:
                jsonReader.endArray();
                break;
            case 6:
                jsonReader.beginObject();
                break;
            case 7:
                jsonReader.endObject();
                break;
            case 8:
                break;
            default:
                throw new IllegalStateException("unknown JsonToken ");
        }
        return this.A00;
    }

    public final Object AwB() {
        return this.A03;
    }

    public final String E2H() {
        return this.A01;
    }

    public final Integer E2K() {
        return this.A00;
    }

    public final C276444tL E2L() {
        return this.A02;
    }

    public final void Evn() {
        Integer num = this.A00;
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2 || num == AnonymousClass05K.A0C) {
            int i = 1;
            while (true) {
                Integer Crg = Crg();
                if (Crg == num2 || Crg == AnonymousClass05K.A0C) {
                    i++;
                } else if (Crg == AnonymousClass05K.A01 || Crg == AnonymousClass05K.A0N) {
                    i--;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public C361008fW(JsonReader jsonReader) {
        this.A03 = jsonReader;
    }
}
