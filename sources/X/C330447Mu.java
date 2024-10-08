package X;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "Please use DirectThreadHeaderViewModel/DirectThreadHeaderViewHolder instead")
/* renamed from: X.7Mu  reason: invalid class name and case insensitive filesystem */
public final class C330447Mu {
    public int A00;
    public Context A01;
    public LayerDrawable A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public C252063oV A0G;
    public C70960OTh A0H = null;
    public C330087Lj A0I;
    public C330047Lf A0J;
    public GradientSpinnerAvatarView A0K;
    public Boolean A0L;
    public final Context A0M;
    public final Handler A0N = new Handler(Looper.getMainLooper());
    public final Fragment A0O;
    public final AnonymousClass0iw A0P;
    public final UserSession A0Q;
    public final C333517Zg A0R;

    public static View A00(2da r8, C330047Lf r9, C330447Mu r10, AnonymousClass7LZ r11) {
        View AA3;
        if (!r11.A0p) {
            return null;
        }
        if (A02(r10, r11)) {
            Context context = r10.A01;
            UserSession userSession = r10.A0Q;
            int i = r11.A02;
            1Av A002 = 1Au.A00(userSession);
            AnonymousClass3JR r3 = new AnonymousClass3JR();
            r3.A05 = 2131975030;
            if (A002.A1s() || !182.A06(0Tu.A05, userSession, 36316830411461282L)) {
                r3.A06 = R.drawable.instagram_tag_pano_outline_24;
                r3.A0G = new C64237LWp(r9);
                AA3 = r8.AA3(new AnonymousClass3Jb(r3));
            } else {
                View inflate = LayoutInflater.from(context).inflate(R.layout.tas_entrypoint_icon_with_badge, (ViewGroup) null);
                0qQ.A07(inflate);
                View requireViewById = inflate.requireViewById(R.id.icon);
                0qQ.A07(requireViewById);
                ((ImageView) requireViewById).setColorFilter(AnonymousClass37O.A00(i));
                r3.A0I = inflate;
                r3.A0G = new LX5(r9, A002);
                AA3 = r8.AA4(new AnonymousClass3Jb(r3));
            }
            C327977Cy r5 = new C327977Cy(r10.A0P, userSession);
            User user = r11.A0E;
            if (user != null) {
                C327977Cy.A00((C69489NmX) null, C69462Nm6.IMPRESSION, C69487NmV.ENTRYPOINT, r5, user.getId(), AnonymousClass0t1.A01.A01(userSession).getId());
            }
            return AA3;
        } else if (!C66700Mb7.A01(r10.A0Q)) {
            return null;
        } else {
            boolean z = r11.A0c;
            AnonymousClass3JR r1 = new AnonymousClass3JR();
            int i2 = R.drawable.instagram_flag_pano_outline_24;
            if (z) {
                i2 = R.drawable.instagram_flag_pano_filled_24;
            }
            r1.A06 = i2;
            int i3 = 2131975853;
            if (z) {
                i3 = 2131962512;
            }
            r1.A05 = i3;
            r1.A0G = new C64236LWo(r9);
            r8.AA3(new AnonymousClass3Jb(r1));
            return null;
        }
    }

    public static void A01(2da r7, C330047Lf r8, C330447Mu r9, AnonymousClass7LZ r10, C331527Ri r11) {
        View.OnClickListener lWt;
        int i;
        int i2;
        AnonymousClass3JR r2;
        View view;
        List list;
        String str;
        UserSession userSession = r9.A0Q;
        C66649MaI A002 = C66653MaM.A00(r9.A0M, userSession);
        if (A002.A0C(r11)) {
            boolean z = r10.A0N;
            if (z || r10.A0M) {
                Context context = r9.A01;
                if (z) {
                    lWt = new C64240LWs(r8);
                    i = R.drawable.instagram_video_chat_filled_12;
                    i2 = 0;
                } else {
                    lWt = new C64241LWt(r8);
                    i = R.drawable.instagram_call_filled_12;
                    i2 = R.color.black;
                }
                C71138Odg.A02(context, lWt, r7, i, i2);
                return;
            }
            UserSession userSession2 = A002.A01;
            if (!C66648MaH.A03(userSession2, r11)) {
                if (r11 == null) {
                    list = null;
                    str = null;
                } else if (r11.C6a() != 1014 || !182.A06(0Tu.A05, userSession2, 36330204939174409L)) {
                    str = r11.C6C();
                    list = r11.BRZ();
                }
                if (!C66649MaI.A01(A002, str, list)) {
                    return;
                }
            }
            boolean z2 = r10.A0s;
            if (!z2 || !r10.A0h || !182.A06(0Tu.A05, userSession, 36329058182643467L)) {
                if (z2) {
                    Context context2 = r9.A01;
                    boolean z3 = r10.A0m;
                    boolean z4 = r10.A0o;
                    int i3 = r10.A02;
                    LX6 lx6 = new LX6(r8, 1Au.A00(userSession));
                    if (z3) {
                        View inflate = LayoutInflater.from(context2).inflate(R.layout.layout_video_call_button_with_presence_indicator, (ViewGroup) null);
                        0qQ.A07(inflate);
                        View requireViewById = inflate.requireViewById(R.id.icon);
                        0qQ.A07(requireViewById);
                        ((ImageView) requireViewById).setColorFilter(AnonymousClass37O.A00(i3));
                        r2 = new AnonymousClass3JR();
                        view = inflate;
                    } else {
                        int i4 = R.drawable.instagram_video_chat_pano_outline_24;
                        if (z4) {
                            i4 = R.drawable.instagram_video_chat_gen_ai_pano_outline_24;
                        }
                        C67694MsY msY = new C67694MsY(context2);
                        msY.setButtonResource(i4);
                        msY.setColorFilter(AnonymousClass37O.A00(i3));
                        r2 = new AnonymousClass3JR();
                        msY.setClipToPadding(false);
                        view = msY;
                    }
                    r2.A0I = view;
                    r2.A05 = 2131976406;
                    r2.A0L = AnonymousClass05K.A15;
                    r2.A0G = lx6;
                    r9.A0A = r7.AA4(new AnonymousClass3Jb(r2));
                }
                if (r10.A0h) {
                    Fragment fragment = r9.A0O;
                    boolean z5 = r10.A0o;
                    int i5 = r10.A02;
                    0qQ.A0B(fragment, 0);
                    C64238LWq lWq = new C64238LWq(r8);
                    C67694MsY msY2 = new C67694MsY(fragment.requireContext());
                    int i6 = R.drawable.instagram_call_pano_outline_24;
                    if (z5) {
                        i6 = R.drawable.instagram_call_gen_ai_pano_outline_24;
                    }
                    msY2.setButtonResource(i6);
                    msY2.setColorFilter(AnonymousClass37O.A00(i5));
                    AnonymousClass3JR r1 = new AnonymousClass3JR();
                    msY2.setClipToPadding(false);
                    r1.A0I = msY2;
                    r1.A05 = 2131953272;
                    r1.A0L = AnonymousClass05K.A15;
                    r1.A0G = lWq;
                    r9.A06 = r7.AA4(new AnonymousClass3Jb(r1));
                    return;
                }
                return;
            }
            Context context3 = r9.A01;
            int i7 = r10.A02;
            C64239LWr lWr = new C64239LWr(r8);
            C67694MsY msY3 = new C67694MsY(context3);
            msY3.setButtonResource(R.drawable.instagram_video_chat_pano_outline_24);
            msY3.setColorFilter(AnonymousClass37O.A00(i7));
            AnonymousClass3JR r12 = new AnonymousClass3JR();
            msY3.setClipToPadding(false);
            r12.A0I = msY3;
            r12.A05 = 2131954539;
            r12.A0L = AnonymousClass05K.A0N;
            r12.A0G = lWr;
            r7.AA4(new AnonymousClass3Jb(r12));
        }
    }

    public static boolean A02(C330447Mu r2, AnonymousClass7LZ r3) {
        if (r3.A0U || r3.A0V) {
            return false;
        }
        UserSession userSession = r2.A0Q;
        if (AnonymousClass431.A01(userSession)) {
            return true;
        }
        if (2Ek.A01(AnonymousClass0t1.A01.A01(userSession))) {
            return 182.A06(0Tu.A05, userSession, 36316830411002524L);
        }
        return false;
    }

    public C330447Mu(Fragment fragment, AnonymousClass0iw r4, UserSession userSession, C333517Zg r6) {
        this.A0O = fragment;
        this.A0M = fragment.requireContext();
        this.A01 = fragment.requireContext();
        this.A0Q = userSession;
        this.A0P = r4;
        this.A0R = r6;
        this.A0L = true;
    }
}
