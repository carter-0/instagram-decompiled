package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.84E  reason: invalid class name */
public final class AnonymousClass84E implements AnonymousClass84F, AnonymousClass84G, C3493580b, C3502283u, AnonymousClass84H {
    public float A00;
    public int A01;
    public ImageView A02;
    public LP6 A03;
    public C380389Xz A04;
    public U1A A05;
    public C352888Fl A06;
    public WJp A07;
    public final Activity A08;
    public final View A09;
    public final ViewGroup A0A;
    public final AnonymousClass4DH A0B;
    public final AnonymousClass0iw A0C;
    public final UserSession A0D;
    public final Runnable A0E = new AnonymousClass84I(this);
    public final AnonymousClass848 A0F;
    public final AnonymousClass80U A0G;
    public final AnonymousClass84J A0H;
    public final boolean A0I;

    public final void D06(String str) {
        String str2 = str;
        if (str != null && this.A0I) {
            AnonymousClass848 r1 = this.A0F;
            if (!r1.A02(str)) {
                r1.A00.Epw(new AnonymousClass8YD(AnonymousClass84B.OTHER, str2, "name_tag", (String) null, (String) null, (String) null, (String) null, -1, false));
            }
        }
    }

    public final void DHa(float f, float f2) {
        this.A00 = (float) Math.min(Math.max((double) f, 0.0d), 1.0d);
    }

    public final void DK7() {
    }

    public final void DwA(User user, boolean z) {
        AnonymousClass80U r1;
        Object r0;
        this.A01 = 0;
        if (z) {
            A01();
            if (((double) this.A00) < 0.01d) {
                r1 = this.A0G;
                r0 = new AnonymousClass8SS(user);
            } else {
                return;
            }
        } else if (!2R8.A04(this.A0D, user)) {
            r1 = this.A0G;
            r0 = new AnonymousClass8SV(user);
        } else {
            return;
        }
        r1.E3H(r0);
    }

    public final void A00() {
        1Q9.A01("instagram_nametag").A08();
        LP6 lp6 = this.A03;
        if (lp6 != null) {
            lp6.A01();
        }
        WJp wJp = this.A07;
        if (wJp != null && !wJp.A03()) {
            AnonymousClass1Nd.A00(wJp.A0G).A02(wJp.A0F, C2370836g.class);
        }
    }

    public final void A01() {
        this.A0A.removeCallbacks(this.A0E);
        C380389Xz r3 = this.A04;
        if (r3 != null) {
            View view = r3.A00;
            C71392co r0 = C315596kB.A02;
            C294975nL A012 = C294975nL.A01(view, 0);
            A012.A0I(0.0f);
            C294975nL A0F2 = A012.A0F(true);
            A0F2.A05 = new C40627Afp(r3);
            A0F2.A0H();
            C315596kB.A08(new View[]{r3.A01}, true);
        }
    }

    public final /* bridge */ /* synthetic */ boolean A76(Object obj, Object obj2) {
        if (((AnonymousClass80V) obj).ordinal() != 45) {
            throw new UnsupportedOperationException("Unexpected filtered state");
        } else if (this.A00 != 0.0f) {
            return false;
        } else {
            return true;
        }
    }

    public final void DDl(String str) {
        this.A0H.A00(str, true, false);
    }

    public final void DLV(String str) {
        this.A0H.A00(str, false, false);
    }

    public final void DfZ(boolean z) {
        this.A0G.E3H(new Object());
    }

    public final void Dfa(float f) {
        C352888Fl r3 = this.A06;
        AnonymousClass80U r1 = this.A0G;
        if (r1.CQ0(AnonymousClass80V.NAMETAG_CAMERA_SCAN_SHOW_RESULT) && r3 != null) {
            C352888Fl.A0C(r3, (int) AnonymousClass37Q.A00((double) f));
        } else if (r1.CQ0(AnonymousClass80V.NAMETAG_IMAGE_SCAN_SHOW_RESULT)) {
            if (this.A02 == null) {
                ViewGroup viewGroup = this.A0A;
                ImageView imageView = (ImageView) ((ViewStub) viewGroup.requireViewById(R.id.nametag_photo_blur_overlay_stub)).inflate();
                this.A02 = imageView;
                C17669Vc0 vc0 = new C17669Vc0(imageView, "NametagFacade", this.A09);
                vc0.A02 = 15;
                vc0.A00 = 6;
                vc0.A03 = viewGroup.getContext().getColor(R.color.primary_text_disabled_material_dark);
                U1A u1a = new U1A(vc0);
                this.A05 = u1a;
                u1a.setVisible(false, false);
            }
            int A002 = (int) AnonymousClass37Q.A00((double) f);
            ImageView imageView2 = this.A02;
            U1A u1a2 = this.A05;
            if (u1a2 != null && imageView2 != null) {
                int i = 0;
                boolean z = false;
                if (A002 > 0) {
                    z = true;
                }
                u1a2.setVisible(z, false);
                if (A002 <= 0) {
                    i = 4;
                }
                imageView2.setVisibility(i);
                imageView2.setImageDrawable(u1a2);
                imageView2.setImageAlpha(A002);
            }
        }
    }

    public final void DkS(String str, int i, String str2) {
        this.A0G.E3H(new AnonymousClass8SU(str2, str, i));
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        User user;
        int ordinal = ((AnonymousClass80V) obj2).ordinal();
        if (ordinal == 45) {
            user = ((AnonymousClass8SS) obj3).A00;
        } else if (ordinal == 46) {
            user = ((AnonymousClass8SV) obj3).A00;
        } else {
            return;
        }
        WJp wJp = this.A07;
        if (wJp != null) {
            wJp.A02(user);
        }
    }

    public final void DwJ(String str, boolean z) {
        C352888Fl r5 = this.A06;
        if (z && r5 != null) {
            int i = this.A01 + 1;
            this.A01 = i;
            if (i >= 10) {
                UserSession userSession = this.A0D;
                0xI A042 = 1Q9.A01("instagram_nametag").A04(AnonymousClass000.A00(3307));
                A042.A08(Integer.valueOf(i), Pxd.A00(213));
                C60510iO.A00(userSession).EFq(A042);
                C352888Fl.A07(r5);
                C59689JTv.A07(this.A08, 2131967986);
            }
        }
    }

    public AnonymousClass84E(ViewGroup viewGroup, AnonymousClass848 r4, AnonymousClass0iw r5, AnonymousClass80D r6, AnonymousClass80U r7) {
        Activity activity = r6.A05;
        this.A08 = activity;
        r6.A0M.getClass();
        this.A0B = r6.A0M;
        this.A0A = viewGroup;
        this.A09 = viewGroup.requireViewById(R.id.camera_photo_texture_view);
        this.A0D = r6.A0S;
        this.A0G = r7;
        this.A0H = new AnonymousClass84J(activity);
        this.A0F = r4;
        this.A0I = r6.A36;
        this.A0C = r5;
    }
}
