package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.Ssc  reason: case insensitive filesystem */
public final class C12388Ssc implements C13863Tij {
    public final C13794ThC A00;
    public final C13685Tf2 A01;

    public final void D0O(Exception exc) {
    }

    public final void DFP(Exception exc) {
    }

    public final void DFQ(Map map, String str) {
    }

    public final void Dic() {
    }

    public final void Did(AnonymousClass4ZS r1) {
    }

    public final void Die(SRW srw) {
    }

    public final void DmL(C10864RzP rzP) {
    }

    public final void DoG(C10940S1w s1w) {
    }

    public final void DtJ() {
    }

    public final void DtM(float f) {
    }

    public final void DtN() {
    }

    public final void DtR(MediaComposition mediaComposition, C10864RzP rzP, List list, boolean z) {
    }

    public final void DtZ(Exception exc, Map map, int i) {
    }

    public final void Dtc(float f) {
    }

    public final void Dte() {
    }

    public final void Dth(Map map) {
    }

    public final /* synthetic */ void Dvk(List list) {
    }

    public final void onFailure(Exception exc) {
    }

    public final void Dif(Exception exc) {
        C13685Tf2 tf2 = this.A01;
        if (tf2 != null) {
            tf2.Db5(C8917RFk.IGMLSegmentAnythingVideoStatusUploading, "Uploading failed");
        }
    }

    public final void Dih(C11284SJc sJc) {
        C13685Tf2 tf2 = this.A01;
        if (tf2 != null) {
            tf2.Db4(C8917RFk.IGMLSegmentAnythingVideoStatusUploading);
        }
    }

    public final void Dii(C11286SJe sJe, C11284SJc sJc) {
        String str = sJe.A03;
        if (str != null) {
            try {
                String string = C66580MXl.A17(str).getString("media_id");
                C13794ThC thC = this.A00;
                if (thC != null) {
                    thC.Dvg(string);
                }
            } catch (JSONException unused) {
                System.out.println("media id doesn't exist for ruload_igvideo");
            }
        }
    }

    public final void DtL(AnonymousClass4ZS r4) {
        C13685Tf2 tf2 = this.A01;
        if (tf2 != null) {
            tf2.Db5(C8917RFk.IGMLSegmentAnythingVideoStatusTranscoding, "Transcoding failed");
        }
    }

    public final void DtP(C7232Q0d q0d, C11354SOn sOn) {
        C13685Tf2 tf2 = this.A01;
        if (tf2 != null) {
            tf2.Db4(C8917RFk.IGMLSegmentAnythingVideoStatusTranscoding);
        }
    }

    public C12388Ssc(C13794ThC thC, C13685Tf2 tf2) {
        this.A00 = thC;
        this.A01 = tf2;
    }
}
