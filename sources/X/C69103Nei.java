package X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Rational;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nei  reason: case insensitive filesystem */
public final class C69103Nei extends C71135OdY {
    public int A00;
    public Rect A01;
    public Rational A02;
    public C74272Ps0 A03;
    public C72834PLw A04;
    public boolean A05;
    public boolean A06;
    public final Activity A07;
    public final Handler A08;
    public final UserSession A09;
    public final OKY A0A;
    public final PMM A0B = PMM.A00;
    public final C71111Ocu A0C;
    public final AnonymousClass0eM A0D = C73922Pm2.A01(this, 4);
    public final AnonymousClass0eM A0E = AnonymousClass1YB.A00(C73879PlG.A00);
    public final AnonymousClass0eM A0F = C73922Pm2.A01(this, 5);
    public final AnonymousClass0eM A0G = AnonymousClass1YB.A00(C73880PlH.A00);

    public static final void A00(Rect rect, Rational rational, C69103Nei nei) {
        float f;
        try {
            OUh oUh = OUh.A00;
            UserSession userSession = nei.A09;
            Activity activity = nei.A07;
            if (AnonymousClass7TE.A1a(oUh.A00(activity, userSession, true).A00)) {
                PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
                if (rational.isInfinite()) {
                    f = 0.0f;
                } else {
                    f = ((float) rational.getNumerator()) / ((float) rational.getDenominator());
                }
                rational.getNumerator();
                rational.getDenominator();
                double d = (double) f;
                if (d > 2.38d) {
                    rational = O59.A00;
                } else if (d < 0.42d) {
                    rational = O59.A01;
                }
                PictureInPictureParams.Builder aspectRatio = builder.setAspectRatio(rational);
                if (Build.VERSION.SDK_INT > 30) {
                    if (rect != null) {
                        aspectRatio.setSourceRectHint(rect);
                    }
                    aspectRatio.setAutoEnterEnabled(true);
                }
                activity.setPictureInPictureParams(aspectRatio.build());
            }
        } catch (Exception e) {
            0wb.A06("RtcCallPipPresenter", "Failed to update PIP params", e);
        }
    }

    public static final boolean A01(C69103Nei nei, Integer num) {
        Integer num2;
        OKY oky;
        C74267Prv pkf;
        int ordinal;
        C72834PLw pLw = nei.A04;
        boolean z = false;
        if (pLw == null || pLw.A01 || !pLw.A00) {
            OUh oUh = OUh.A00;
            UserSession userSession = nei.A09;
            Activity activity = nei.A07;
            0eP A002 = oUh.A00(activity, userSession, false);
            if (!AnonymousClass7TE.A1a(A002.A00)) {
                C69279Nif nif = (C69279Nif) A002.A01;
                if (nif == null || (ordinal = nif.ordinal()) == -1) {
                    num2 = null;
                } else if (ordinal == 0) {
                    num2 = AnonymousClass05K.A00;
                } else if (ordinal == 1) {
                    num2 = AnonymousClass05K.A01;
                } else if (ordinal == 2) {
                    num2 = AnonymousClass05K.A0C;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                oky = nei.A0A;
                pkf = new PKF(num, num2, false);
            } else {
                C71111Ocu ocu = nei.A0C;
                ocu.A05(C72875PNl.A00);
                try {
                    Rational rational = nei.A02;
                    if (rational == null) {
                        rational = new Rational(0nA.A09(activity), 0nA.A08(activity));
                    }
                    z = activity.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(rational).build());
                } catch (Exception e) {
                    0wb.A06("RtcCallPipPresenter", "Failed to enter PIP mode", e);
                }
                if (z && !((KeyguardManager) nei.A0F.getValue()).isDeviceLocked()) {
                    ocu.A05(C72887PNx.A00);
                }
                nei.A0A.A00(new PKF(num, (Integer) null, z));
                return z;
            }
        } else {
            if (num != AnonymousClass05K.A01) {
                nei.A07.finish();
                oky = nei.A0A;
                pkf = PLI.A00;
            }
            return false;
        }
        oky.A00(pkf);
        return false;
    }

    public final boolean A0L(C74271Prz prz) {
        Integer num;
        if (prz instanceof PMY) {
            boolean z = ((PMY) prz).A00;
            if (!z || !this.A05) {
                this.A0C.A05(new PNG(z));
            }
            return true;
        }
        if (prz instanceof PMX) {
            if (Build.VERSION.SDK_INT > 30) {
                return false;
            }
            num = AnonymousClass05K.A01;
        } else if (!(prz instanceof PMW)) {
            return false;
        } else {
            num = AnonymousClass05K.A00;
        }
        return A01(this, num);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69103Nei(Activity activity, UserSession userSession, OKY oky, C71111Ocu ocu) {
        super(DbS.A0z(C72834PLw.class));
        Handler A0D2 = AnonymousClass7TF.A0D();
        AnonymousClass7TG.A1Q(ocu, oky);
        this.A09 = userSession;
        this.A0C = ocu;
        this.A0A = oky;
        this.A07 = activity;
        this.A08 = A0D2;
    }
}
