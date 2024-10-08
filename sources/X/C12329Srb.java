package X;

import java.io.File;
import java.util.List;

/* renamed from: X.Srb  reason: case insensitive filesystem */
public final class C12329Srb implements C13834Ti9 {
    public final int A00;
    public final Object A01;

    public C12329Srb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D0g(SJL sjl) {
        if (this.A00 == 0) {
            Exception exc = new Exception("cancelled");
            SRI sri = (SRI) this.A01;
            sri.A04();
            C13834Ti9 ti9 = sri.A0B.A07;
            if (ti9 != null) {
                ti9.DDE(sjl, exc);
            }
        }
    }

    public final void D5E(List list) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                if (list == null || list.size() != 1) {
                    throw DbT.A0m();
                }
                QDV qdv = ((C11260SHu) this.A01).A01;
                if (qdv != null) {
                    qdv.A05.A0A(((SRW) list.get(0)).A0N);
                    return;
                }
                return;
            default:
                if (list == null || list.size() != 1) {
                    throw DbT.A0m();
                }
                String absolutePath = ((SRW) list.get(0)).A0N.getAbsolutePath();
                C11260SHu sHu = (C11260SHu) this.A01;
                sHu.A02 = AnonymousClass7TE.A0t(absolutePath);
                0qQ.A0A(absolutePath);
                sHu.A00 = (long) AIF.A00(absolutePath);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void DDE(SJL sjl, Object obj) {
        StringBuilder A1A;
        String str;
        switch (this.A00) {
            case 0:
                SRI sri = (SRI) this.A01;
                sri.A04();
                C13834Ti9 ti9 = sri.A0B.A07;
                if (ti9 != null) {
                    ti9.DDE(sjl, obj);
                    return;
                }
                return;
            case 1:
                A1A = AnonymousClass7TE.A1A();
                str = "concatAudioWithBleep has error: ";
                break;
            default:
                A1A = AnonymousClass7TE.A1A();
                str = "convertBleepAudio has error: ";
                break;
        }
        0KC.A0C("KaraokeBleepAudioConcatInteractor", AnonymousClass7TG.A0m(obj, str, A1A));
    }

    public final void DaK(double d) {
    }

    public final void Dia(SRW srw) {
    }

    public final void onStart() {
    }

    public final void DiY(File file, long j) {
    }
}
