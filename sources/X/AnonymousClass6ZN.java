package X;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.flyingreactionview.FlyingReactionView;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.6ZN  reason: invalid class name */
public final class AnonymousClass6ZN {
    public 0wc A00;
    public UserSession A01;
    public C273414mX A02;
    public C314116hg A03;
    public C314196ho A04;
    public K3O A05;
    public C311506cn A06;
    public C62320sa A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass0iw A0D;
    public final C273434mZ A0E;
    public final C273384mU A0F;
    public final C317116mk A0G;
    public final WeakReference A0H;
    public final AnonymousClass0eM A0I = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LF(this, 8));

    public final void A01(Context context, View view, AnonymousClass4DH r25, C255773uh r26, String str, String str2, boolean z) {
        String str3;
        String str4;
        C255773uh r10 = r26;
        AnonymousClass4DH r2 = r25;
        if (!r10.CcK() || A00(context, r10, this)) {
            C317116mk r1 = this.A0G;
            r1.Etq();
            if (r1.ARh()) {
                User user = r10.A0i;
                if (user != null) {
                    str4 = user.getUsername();
                } else {
                    str4 = "";
                }
                r1.EvK(str4);
                return;
            }
            C311506cn r9 = this.A06;
            View view2 = null;
            if (r9 == null) {
                str3 = "reelMessageHelper";
            } else {
                String str5 = str;
                LOD lod = new LOD((ExtendedImageUrl) null, str5, str2, (String) null, (String) null, (String) null);
                C273384mU r3 = this.A0F;
                ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r3;
                C250973mM r8 = reelViewerFragment.A0a;
                if (r8 != null) {
                    String moduleName = this.A0D.getModuleName();
                    C308426Uf r4 = C308426Uf.A00;
                    User user2 = r10.A0i;
                    UserSession userSession = this.A01;
                    str3 = "userSession";
                    if (userSession != null) {
                        C311506cn r16 = r9;
                        C255773uh r17 = r10;
                        C250973mM r18 = r8;
                        r16.A01(r17, r18, lod, moduleName, r4.A00(userSession, user2));
                        UserSession userSession2 = this.A01;
                        if (userSession2 != null) {
                            0Tu r42 = 0Tu.A05;
                            if (!Boolean.valueOf(182.A06(r42, userSession2, 36321232752223418L)).booleanValue()) {
                                C314116hg r12 = this.A03;
                                if (r12 == null) {
                                    str3 = "balloonsAnimationController";
                                } else {
                                    r12.A02(new C65776LzU(this), str5);
                                }
                            } else if (r2 instanceof ReelViewerFragment) {
                                C316026kz Aui = ((ReelViewerFragment) r2).Aui();
                                if (Aui != null) {
                                    view2 = Aui.BhB();
                                }
                                C314196ho r13 = this.A04;
                                if (r13 == null) {
                                    str3 = "flyingReactionController";
                                } else if (C336957fS.A03(str5)) {
                                    C252063oV r14 = r13.A00;
                                    r14.getView().setVisibility(0);
                                    if (view2 != null) {
                                        View view3 = view;
                                        view3.performHapticFeedback(1);
                                        FlyingReactionView flyingReactionView = (FlyingReactionView) r14.getView();
                                        int[] iArr = new int[2];
                                        view3.getLocationOnScreen(iArr);
                                        Point point = new Point(iArr[0] + (view3.getWidth() / 2), iArr[1] + (view3.getHeight() / 2));
                                        int[] iArr2 = new int[2];
                                        view2.getLocationOnScreen(iArr2);
                                        Point point2 = new Point(iArr2[0] + (view2.getWidth() / 2), iArr2[1] + (view2.getHeight() / 2));
                                        VXE vxe = new VXE(view3, view2, r3);
                                        if (!flyingReactionView.A02) {
                                            C336957fS r15 = C317486nL.A04;
                                            if (C336957fS.A03(str5)) {
                                                flyingReactionView.A00 = vxe;
                                                int[] iArr3 = new int[2];
                                                flyingReactionView.getLocationOnScreen(iArr3);
                                                C19215WPv wPv = new C19215WPv(point, point2, flyingReactionView, iArr3);
                                                1OO A0J = 1NK.A00().A0J(r15.A04(str5), "FlyingReactionViewDrawable");
                                                A0J.A02(wPv);
                                                A0J.A01();
                                            }
                                        }
                                    }
                                }
                            }
                            UserSession userSession3 = this.A01;
                            if (userSession3 != null) {
                                if (Boolean.valueOf(182.A06(r42, userSession3, 36327821232126687L)).booleanValue()) {
                                    UserSession userSession4 = this.A01;
                                    if (userSession4 != null) {
                                        0xa r32 = 1Au.A00(userSession4).A01;
                                        int i = r32.getInt("story_reaction_sent_count", 0) + 1;
                                        0xY AR4 = r32.AR4();
                                        AR4.E5Z("story_reaction_sent_count", i);
                                        AR4.apply();
                                    }
                                }
                                UserSession userSession5 = this.A01;
                                if (userSession5 != null) {
                                    C17833Vgm A002 = C70302O1g.A00(userSession5);
                                    A002.A01.flowMarkPoint(A002.A00, "reply_with_quick_reaction", "");
                                    this.A0C = z;
                                    AnonymousClass6SY r0 = reelViewerFragment.mBackwardsCompatibilityViewModel;
                                    if (r0 != null) {
                                        r0.A00();
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            0qQ.A0F(str3);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public AnonymousClass6ZN(AnonymousClass0iw r4, C273434mZ r5, C273384mU r6, C317116mk r7, WeakReference weakReference) {
        this.A0H = weakReference;
        this.A0F = r6;
        this.A0G = r7;
        this.A0E = r5;
        this.A0D = r4;
    }

    public static final boolean A00(Context context, C255773uh r4, AnonymousClass6ZN r5) {
        if (r4.CcK() && r4.A0r()) {
            AnonymousClass47L r2 = AnonymousClass47L.AD_DESTINATION_DIRECT_MESSAGE;
            UserSession userSession = r5.A01;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            AndroidLink A042 = AnonymousClass4EQ.A04(context, userSession, r4);
            if (A042 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (r2 != C271714jT.A01(A042)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
