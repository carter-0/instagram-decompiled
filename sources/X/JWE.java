package X;

import android.graphics.PointF;
import android.graphics.Rect;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class JWE implements C3499682q {
    public final UserSession A00;
    public final CreationSession A01;

    public final JWE ExH(String str) {
        0qQ.A0B(str, 0);
        CreationSession creationSession = this.A01;
        MediaSession mediaSession = creationSession.A07;
        if (mediaSession != null) {
            creationSession.A0E.remove(mediaSession);
            creationSession.A07 = null;
        }
        creationSession.A07(str, (String) null, true);
        return this;
    }

    public static CreationSession A00(JW7 jw7) {
        return ((JWE) jw7.A19).A01;
    }

    public static PhotoSession A02(Object obj) {
        return ((JWE) obj).A01.A02();
    }

    public static VideoSession A03(Object obj) {
        VideoSession A04 = ((JWE) obj).A01.A04();
        A04.getClass();
        return A04;
    }

    public static AnonymousClass36W A04(Object obj) {
        AnonymousClass36W r0 = ((JWE) obj).A01.A0A;
        r0.getClass();
        return r0;
    }

    public static AnonymousClass3Q2 A05(C267834cI r1, Object obj) {
        return r1.BbQ(((JWE) obj).A01.A0C);
    }

    public final float AAx() {
        float f = this.A01.A00;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    public final AnonymousClass36W AGg() {
        AnonymousClass36W r0 = this.A01.A0A;
        r0.getClass();
        return r0;
    }

    public final AnonymousClass514 ANP() {
        AnonymousClass514 r0 = this.A01.A05;
        if (r0 == null) {
            return AnonymousClass514.SQUARE;
        }
        return r0;
    }

    public final int ATT() {
        CreationSession creationSession = this.A01;
        if (creationSession.A02() != null) {
            return creationSession.A02().A0D.getValue();
        }
        return 0;
    }

    public final boolean CKG() {
        MediaCaptureConfig mediaCaptureConfig = this.A01.A09;
        if (mediaCaptureConfig == null || mediaCaptureConfig.A00 == null) {
            return false;
        }
        return true;
    }

    public final boolean CKP() {
        Iterator it = this.A01.A0E.iterator();
        while (it.hasNext()) {
            if (JTO.A0Z(it).Bsu() == AnonymousClass05K.A00) {
                return true;
            }
        }
        return false;
    }

    public final boolean CL3() {
        Iterator it = this.A01.A0E.iterator();
        while (it.hasNext()) {
            if (JTO.A0Z(it).Bsu() == AnonymousClass05K.A01) {
                return true;
            }
        }
        return false;
    }

    public final boolean COf() {
        return AnonymousClass7TF.A1V(this.A01.A0C);
    }

    public final boolean CZ4() {
        MediaSession mediaSession = this.A01.A07;
        if (mediaSession == null || mediaSession.Bsu() != AnonymousClass05K.A00) {
            return false;
        }
        return true;
    }

    public final List Co4() {
        return C51966G9m.A1J(this.A01.A0E);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r3.A03 == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.L83 E0c() {
        /*
            r11 = this;
            com.instagram.creation.base.CreationSession r1 = r11.A01
            int r2 = r1.A00()
            int r0 = r1.A01()
            int r8 = java.lang.Math.min(r2, r0)
            X.514 r3 = r1.A05
            if (r3 != 0) goto L_0x0014
            X.514 r3 = X.AnonymousClass514.SQUARE
        L_0x0014:
            X.514 r0 = X.AnonymousClass514.SQUARE
            r10 = 0
            if (r3 != r0) goto L_0x0020
            r1 = r8
        L_0x001a:
            X.L83 r0 = new X.L83
            r0.<init>(r8, r1, r10, r10)
            return r0
        L_0x0020:
            java.lang.String r0 = r1.A0C
            if (r0 == 0) goto L_0x0080
            r2 = 1
            float r4 = r1.A00
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x002e:
            if (r2 == 0) goto L_0x007d
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            if (r0 == 0) goto L_0x007b
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            X.MRo r0 = r0.A0D
            int r0 = r0.getValue()
        L_0x0040:
            int r0 = r0 % 180
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.A03
            r9 = 1
            if (r0 != 0) goto L_0x004a
        L_0x0049:
            r9 = 0
        L_0x004a:
            int r5 = r1.A01()
            int r6 = r1.A00()
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            if (r0 == 0) goto L_0x0079
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            X.MRo r0 = r0.A0D
            int r7 = r0.getValue()
        L_0x0062:
            X.34S r1 = X.JW0.A09(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r1.A00
            r0.getClass()
            int r8 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r1.A01
            r0.getClass()
            int r1 = X.AnonymousClass7TE.A0M(r0)
            goto L_0x001a
        L_0x0079:
            r7 = 0
            goto L_0x0062
        L_0x007b:
            r0 = 0
            goto L_0x0040
        L_0x007d:
            boolean r9 = r3.A03
            goto L_0x004a
        L_0x0080:
            r2 = 0
            float r4 = r3.A00
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWE.E0c():X.L83");
    }

    public final String E2M() {
        MediaSession mediaSession = this.A01.A07;
        if (mediaSession != null) {
            return mediaSession.BbR();
        }
        return null;
    }

    public final String E2g() {
        PhotoSession A02 = this.A01.A02();
        A02.getClass();
        String str = A02.A0B;
        0qQ.A07(str);
        return str;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.LFT] */
    public final void EK5(C267834cI r10) {
        CreationSession creationSession = this.A01;
        List list = creationSession.A0Q;
        list.clear();
        Iterator it = creationSession.A0E.iterator();
        while (it.hasNext()) {
            MediaSession A0Z = JTO.A0Z(it);
            ? obj = new Object();
            String BbR = A0Z.BbR();
            if (BbR == null) {
                0f9 AEf = 0wj.A01.AEf("setPendingMediaKey", 817891240);
                AEf.ABQ(DialogModule.KEY_MESSAGE, "pending media key should not be null");
                AEf.report();
            }
            obj.A06 = BbR;
            obj.A04 = A0Z;
            Integer Bsu = A0Z.Bsu();
            if (Bsu == AnonymousClass05K.A00) {
                obj.A01(A0Z.B5r());
            } else if (Bsu == AnonymousClass05K.A01) {
                AnonymousClass3Q2 BbQ = r10.BbQ(BbR);
                if (BbQ == null) {
                    0kD.A01("CreationSession_saveMediaSessionStates", "pendingMedia is null and media type Video media session state was not saved.");
                } else {
                    obj.A03 = BbQ.A1i.A01;
                    obj.A02 = BbQ.A05;
                    ClipInfo clipInfo = BbQ.A1N;
                    obj.A01 = clipInfo.A07;
                    obj.A00 = clipInfo.A05;
                    obj.A07 = BbQ.A5F;
                }
            }
            list.add(obj);
        }
        creationSession.A0H = false;
    }

    public final void EOM(String str) {
        CreationSession creationSession = this.A01;
        creationSession.A0E.clear();
        creationSession.A07 = null;
        creationSession.A0H = false;
        creationSession.A0C = str;
    }

    public final void EOx(float f) {
        VideoSession A04 = this.A01.A04();
        A04.getClass();
        A04.A00 = f;
    }

    public final JWE ETL(Rect rect, int i, int i2) {
        CreationSession creationSession = this.A01;
        CropInfo cropInfo = new CropInfo(rect, i, i2);
        if (creationSession.A02() != null) {
            creationSession.A02().A05 = cropInfo;
        }
        return this;
    }

    public final void EVc(int i) {
        PhotoSession A02 = this.A01.A02();
        A02.getClass();
        ((C64919LkJ) A02.A0D).A00.A01 = i;
    }

    public final JWE EfU(String str) {
        MediaSession mediaSession = this.A01.A07;
        if (mediaSession != null) {
            mediaSession.EfV(str);
        }
        return this;
    }

    public final JWE ExF(String str, String str2) {
        CreationSession creationSession = this.A01;
        MediaSession mediaSession = creationSession.A07;
        if (mediaSession != null) {
            creationSession.A0E.remove(mediaSession);
            creationSession.A07 = null;
        }
        creationSession.A07(str, str2, false);
        return this;
    }

    public final List FN1() {
        CreationSession creationSession = this.A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = creationSession.A0E.iterator();
        while (it.hasNext()) {
            MediaSession A0Z = JTO.A0Z(it);
            if (A0Z.Bsu() == AnonymousClass05K.A01) {
                A1C.add(A0Z);
            }
        }
        return C51966G9m.A1J(A1C);
    }

    public JWE(UserSession userSession, CreationSession creationSession) {
        this.A01 = creationSession;
        this.A00 = userSession;
    }

    public static CreationSession A01(C3499582p r0) {
        return ((JWE) r0.A00()).A01;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Kof, java.lang.Object] */
    public final void AAC(PointF pointF, String str, float f) {
        AnonymousClass7TG.A1N(str, pointF);
        CreationSession creationSession = this.A01;
        Float valueOf = Float.valueOf(f);
        Map map = creationSession.A0R;
        float floatValue = valueOf.floatValue();
        ? obj = new Object();
        obj.A01 = pointF;
        obj.A00 = floatValue;
        map.put(str, obj);
    }
}
