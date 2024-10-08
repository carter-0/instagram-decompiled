package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9oD  reason: invalid class name and case insensitive filesystem */
public final class C388679oD extends C388689oE implements C3510487j {
    public int A00;
    public Drawable A01;
    public C369948va A02;
    public AnonymousClass804 A03;
    public boolean A04;
    public boolean A05;
    public final UserSession A06;
    public final C3510387i A07;
    public final TargetViewSizeProvider A08;
    public final B1T A09;
    public final C3498982i A0A;
    public final C339977kU A0B;
    public final String A0C;
    public final String A0D;
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A01(new MMQ(this, 10));
    public final AnonymousClass0eM A0F;
    public final C3510387i A0G;

    public final String A05() {
        int ordinal = this.A0A.A02.ordinal();
        if (ordinal == 0) {
            AnonymousClass804 r1 = this.A03;
            if (r1 instanceof AnonymousClass803) {
                throw AnonymousClass7TE.A0z(C41611AxP.A00.toString());
            } else if (!(r1 instanceof C339987kV)) {
                return "";
            } else {
                throw AnonymousClass7TE.A0z(C41612AxQ.A00.toString());
            }
        } else if (ordinal == 1) {
            AnonymousClass804 r12 = this.A03;
            if (r12 instanceof AnonymousClass803) {
                return "remix_sticker_side_by_side";
            }
            if (r12 instanceof C339987kV) {
                return "remix_sticker_picture_in_picture";
            }
            return "";
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public final void DKg(int i) {
        this.A00 = i;
        C3510387i r1 = this.A07;
        if (r1.A0B()) {
            r1.A05 = i;
        }
    }

    public final void DV1(float f) {
        C3510387i r1 = this.A07;
        if (r1.A0B()) {
            r1.DV1(f);
        }
    }

    public final void DV2(float f) {
        C3510387i r1 = this.A07;
        if (r1.A0B()) {
            r1.DV2(f);
        }
    }

    public final void Dg1(float f) {
        C3510387i r1 = this.A07;
        if (r1.A0B()) {
            r1.Dg1(f);
        }
    }

    public final void Dgr(float f) {
        if (this.A02 != null) {
            C3510387i r1 = this.A07;
            if (r1.A0B()) {
                r1.Dgr(f);
            }
            if (!this.A04) {
                AnonymousClass804 r12 = this.A03;
                if (r12 instanceof C339987kV) {
                    return;
                }
                if ((r12 instanceof C365058mS) && !this.A05) {
                    return;
                }
            }
            C369948va r13 = this.A02;
            if (r13 != null) {
                r13.DdD(this.A03, f);
            } else {
                0qQ.A0F("thumbnailDrawable");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C388679oD(Context context, UserSession userSession, C279284yO r5, C3510387i r6, TargetViewSizeProvider targetViewSizeProvider, B1T b1t, C3498982i r9, String str, String str2) {
        super(context, r5, r9.A03);
        AnonymousClass7TG.A1U(context, userSession, r5);
        AnonymousClass7TF.A1F(r6, 6, targetViewSizeProvider);
        this.A06 = userSession;
        this.A07 = r6;
        this.A09 = b1t;
        this.A0A = r9;
        this.A0C = str;
        this.A0G = r6;
        this.A08 = targetViewSizeProvider;
        this.A0D = str2;
        this.A0B = C339977kU.HORIZONTAL;
        this.A0F = AnonymousClass0eN.A01(new MMQ(this, 9));
        this.A03 = A04()[0];
    }
}
