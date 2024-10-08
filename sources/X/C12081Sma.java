package X;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Sma  reason: case insensitive filesystem */
public final class C12081Sma implements C13924TlS {
    public long A00;
    public final Q1J A01;
    public final C11284SJc A02;
    public final /* synthetic */ STT A03;

    public final void D5G(C11286SJe sJe) {
        0qQ.A0B(sJe, 0);
        this.A01.A00((Object) null, 1.0d);
        A01(this, (Exception) null, "onCompletion segment=%s", A00(this));
        STT stt = this.A03;
        C10746RxQ rxQ = stt.A0C.A03;
        C13886Tj9 tj9 = rxQ.A03;
        rxQ.A01 = tj9.now();
        C9596Rda.A00(tj9, (Exception) null, "media_upload_chunk_transfer_dequeue", rxQ.A04, -1);
        stt.A0K.execute(new C13039TIv(sJe, this, stt));
    }

    public final void DEM(Exception exc, String str, String str2, Map map, int i, long j, boolean z) {
        0qQ.A0B(str, 1);
        A01(this, (Exception) null, "onFailRequest segment=%s, backoff=%s, failureReason=%s, isRetriable=%s, methodName=%s, statusCode=%d", A00(this), Long.valueOf(j), str, Boolean.valueOf(z), str2, Integer.valueOf(i));
    }

    public final void DEX(C8989RKf rKf) {
        0qQ.A0B(rKf, 0);
        A01(this, rKf, "onFailure segment=%s", A00(this));
        STT stt = this.A03;
        STT.A04(this.A02, stt, rKf, rKf.A04, rKf.A00);
    }

    public C12081Sma(C11284SJc sJc, STT stt) {
        this.A03 = stt;
        this.A02 = sJc;
        this.A01 = new C7953Qdu(this, stt);
    }

    public static final String A00(C12081Sma sma) {
        Locale locale = Locale.ROOT;
        C11284SJc sJc = sma.A02;
        return Pxe.A12(locale, "%s/%s", Pxf.A1X(Integer.valueOf(sJc.A00), sJc.A04, 2));
    }

    public static final void A01(C12081Sma sma, Exception exc, String str, Object... objArr) {
        String str2 = str;
        Q1R.A03.A00(sma.A03.A0E, "transfer", "UploadProtocol", str2, exc, Arrays.copyOf(objArr, objArr.length));
    }

    public final void Czl(long j) {
        this.A00 = j;
    }

    public final void DaE(float f) {
        Q1J q1j = this.A01;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        q1j.A00((Object) null, (double) f);
    }

    public final void Dtg(S49 s49) {
    }

    public final void onStart() {
        C11284SJc sJc = this.A02;
        A01(this, (Exception) null, "onStart segment=%s", sJc);
        STT stt = this.A03;
        synchronized (stt) {
            C10747RxR rxR = stt.A0C;
            C11187SEn sEn = rxR.A02;
            synchronized (sEn) {
                sEn.A01.put(sJc, Long.valueOf(sEn.A00.now()));
                C11187SEn.A00(sJc, sEn, (Exception) null, "media_upload_chunk_transfer_start", (JSONObject) null, -1);
            }
            rxR.A04.Dih(sJc);
        }
    }

    public final void D0e() {
        A01(this, (Exception) null, "onCancellation segment=%s", A00(this));
    }

    public final void DFh(String str, Map map) {
        A01(this, (Exception) null, "onFinishFetchOffsetGetRequest segment=%s, response=%s", A00(this), str);
    }

    public final void DFl(String str, Map map, boolean z) {
        A01(this, (Exception) null, "onFinishPostRequest segment=%s, wasDuplicate=%s", A00(this), Boolean.valueOf(z));
    }

    public final void Dj3(long j, boolean z) {
        A01(this, (Exception) null, "onSendBytesUsingPostRequest segment=%s, offset=%s, isDuplicate=%s", A00(this), Long.valueOf(j), Boolean.valueOf(z));
    }

    public final void Dj7(String str, Map map) {
        A01(this, (Exception) null, "onSendFetchOffsetGetRequest segment=%s, uri=%s", A00(this), str);
    }
}
