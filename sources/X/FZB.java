package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;

public final class FZB implements MTS {
    public final int A00;
    public final Object A01;

    public FZB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFailure(Exception exc) {
        Activity activity;
        String str;
        switch (this.A00) {
            case 2:
                activity = ((F0Q) this.A01).A02;
                str = AnonymousClass000.A00(276);
                break;
            case 3:
                OV1.A00((OV1) this.A01);
                return;
            case 4:
                activity = ((C49696F2h) this.A01).A03;
                break;
            case 5:
                activity = ((F0R) this.A01).A02;
                break;
            default:
                return;
        }
        str = "shareToStory_unknown_error_occured";
        C59689JTv.A0C(activity, str);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Bundle A0A;
        UserSession userSession;
        Class<TransparentModalActivity> cls;
        Activity activity;
        switch (this.A00) {
            case 0:
                0qQ.A0B(obj, 0);
                ((0sP) this.A01).invoke(obj);
                return;
            case 1:
                0qQ.A0B(obj, 0);
                ((C16037UnQ) this.A01).A08.Epw(obj);
                return;
            case 2:
                File file = (File) obj;
                A0A = DbY.A0A(file);
                F0Q f0q = (F0Q) this.A01;
                RectF rectF = f0q.A00;
                if (rectF == null) {
                    rectF = (RectF) f0q.A05.getValue();
                }
                A0A.putParcelable(AnonymousClass000.A00(471), rectF);
                RectF rectF2 = f0q.A01;
                if (rectF2 == null) {
                    rectF2 = (RectF) f0q.A05.getValue();
                }
                A0A.putParcelable(AnonymousClass000.A00(472), rectF2);
                A0A.putString(AnonymousClass000.A00(473), file.getCanonicalPath());
                A0A.putParcelable(AnonymousClass000.A00(2464), f0q.A04);
                A0A.putParcelable(AnonymousClass000.A00(474), (Parcelable) null);
                userSession = f0q.A03;
                cls = TransparentModalActivity.class;
                activity = f0q.A02;
                break;
            case 3:
                File A0T = Dba.A0T(obj);
                OV1 ov1 = (OV1) this.A01;
                ov1.A00.A07 = A0T.getCanonicalPath();
                OV1.A00(ov1);
                return;
            case 4:
                File file2 = (File) obj;
                A0A = AnonymousClass7TE.A0a();
                C49696F2h f2h = (C49696F2h) this.A01;
                A0A.putSerializable(AnonymousClass000.A00(2465), 28D.A3p);
                RectF rectF3 = f2h.A01;
                if (rectF3 == null && (rectF3 = f2h.A00) == null) {
                    Activity activity2 = f2h.A03;
                    int A09 = 0nA.A09(activity2);
                    int A08 = 0nA.A08(activity2);
                    rectF3 = new RectF(0.0f, (float) A08, (float) A09, (float) (A08 * 2));
                    f2h.A00 = rectF3;
                }
                A0A.putParcelable(AnonymousClass000.A00(471), rectF3);
                RectF rectF4 = f2h.A02;
                if (rectF4 == null && (rectF4 = f2h.A00) == null) {
                    Activity activity3 = f2h.A03;
                    int A092 = 0nA.A09(activity3);
                    int A082 = 0nA.A08(activity3);
                    rectF4 = new RectF(0.0f, (float) A082, (float) A092, (float) (A082 * 2));
                    f2h.A00 = rectF4;
                }
                A0A.putParcelable(AnonymousClass000.A00(472), rectF4);
                A0A.putString(AnonymousClass000.A00(473), file2.getAbsolutePath());
                A0A.putParcelable(AnonymousClass000.A00(2467), f2h.A05);
                A0A.putBoolean(AnonymousClass000.A00(2466), false);
                A0A.putParcelable(AnonymousClass000.A00(2469), (Parcelable) null);
                A0A.putParcelable(AnonymousClass000.A00(474), (Parcelable) null);
                userSession = f2h.A04;
                cls = TransparentModalActivity.class;
                activity = f2h.A03;
                break;
            default:
                File file3 = (File) obj;
                A0A = DbY.A0A(file3);
                F0R f0r = (F0R) this.A01;
                RectF rectF5 = f0r.A00;
                if (rectF5 == null) {
                    rectF5 = (RectF) f0r.A05.getValue();
                }
                A0A.putParcelable(AnonymousClass000.A00(471), rectF5);
                RectF rectF6 = f0r.A01;
                if (rectF6 == null) {
                    rectF6 = (RectF) f0r.A05.getValue();
                }
                A0A.putParcelable(AnonymousClass000.A00(472), rectF6);
                A0A.putString(AnonymousClass000.A00(473), file3.getCanonicalPath());
                A0A.putParcelable(AnonymousClass000.A00(2468), f0r.A04);
                A0A.putParcelable(AnonymousClass000.A00(474), (Parcelable) null);
                userSession = f0r.A03;
                cls = TransparentModalActivity.class;
                activity = f0r.A02;
                break;
        }
        DbU.A0x(activity, A0A, userSession, cls, C273654mx.A00(3234));
    }
}
