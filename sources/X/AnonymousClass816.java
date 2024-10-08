package X;

import android.media.MediaActionSound;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;

/* renamed from: X.816  reason: invalid class name */
public final class AnonymousClass816 implements C252243on {
    public boolean A00 = true;
    public final AnonymousClass80R A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());

    public final void A02(List list) {
        AnonymousClass80R r4 = this.A01;
        ShareToFriendsStoryDrawerController shareToFriendsStoryDrawerController = r4.A29;
        Object value = shareToFriendsStoryDrawerController.A03.getValue();
        0qQ.A07(value);
        ((C19140WMw) value).A05(true);
        shareToFriendsStoryDrawerController.A01.D48(shareToFriendsStoryDrawerController);
        r4.A0a.A0D(false);
        int ordinal = r4.A0o.A02.A01().ordinal();
        List list2 = list;
        if (ordinal == 0) {
            AnonymousClass8K4 r42 = r4.A0c;
            UserStoryTarget userStoryTarget = UserStoryTarget.A0C;
            AnonymousClass8K4.A08(r42, (B1O) null, new LD4((DirectShareTarget) null, userStoryTarget, ShareType.SHARE_TO_FRIENDS_STORY), (C381539bv) null, (C381779cJ) null, (L8M) null, (AnonymousClass8VT) null, (C15023UKc) null, (Boolean) null, AnonymousClass05K.A00, (String) null, (String) null, (String) null, (String) null, (List) null, list2, 1, false, false);
        } else if (ordinal == 1) {
            r4.A0g.A0O(new LD4((DirectShareTarget) null, UserStoryTarget.A0C, ShareType.SHARE_TO_FRIENDS_STORY), (C381779cJ) null, (L8M) null, (AnonymousClass8VT) null, (Boolean) null, AnonymousClass05K.A00, (String) null, (String) null, (String) null, (String) null, (List) null, list2, 1, false);
        } else {
            throw new UnsupportedOperationException("Unknown media type");
        }
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    private C362048hG A00() {
        AnonymousClass8WX r0 = this.A01.A1N;
        if (r0 != null) {
            return r0.A00().A02;
        }
        return null;
    }

    public final void A01() {
        UserSession userSession;
        AnonymousClass8DH r2;
        0lq.A02(002.A0R("QccFragmentLifecycleListener", "#onResumeImpl"));
        AnonymousClass80R r1 = this.A01;
        AnonymousClass4DH r5 = r1.A0J;
        if (r5.isAdded()) {
            try {
                this.A00 = false;
                r1.A0m.A02 = true;
                C3511387s r6 = r1.A1o;
                05G r3 = r6.A0S;
                Object value = r3.getValue();
                AnonymousClass883 r22 = AnonymousClass883.PAUSED;
                if (value == r22) {
                    AnonymousClass8YK r0 = (AnonymousClass8YK) r6.A0H.A02();
                    if (r0 != null) {
                        int ordinal = r0.ordinal();
                        if (ordinal == 0) {
                            r22 = AnonymousClass883.LANDING_PAGE_PLAYBACK;
                        } else if (ordinal == 1) {
                            r22 = AnonymousClass883.BUILDER_PLAYBACK;
                        }
                    }
                    r3.Epw(r22);
                }
                if (r1.A0v.A3h) {
                    r1.A0w.A01();
                }
                AnonymousClass8DD r23 = r1.A1I;
                if (r23 != null) {
                    if (AnonymousClass8DD.A0C(r23) && !r23.A08) {
                        AnonymousClass8DM r02 = r23.A0O;
                        if (r02 != null) {
                            r02.onResume();
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    C3502984c r03 = r23.A0J;
                    if (!(r03 == null || (r2 = r23.A0P) == null)) {
                        ((C357648Za) r03.A00.A00()).A01(r2);
                    }
                }
                if (A00() != null) {
                    A00().onResume();
                }
                AnonymousClass8XA A002 = r1.A1N.A00();
                A002.A04 = true;
                AnonymousClass8XW r04 = A002.A03;
                if (r04 != null) {
                    r04.A09();
                }
                r1.A0e.onResume();
                C356848Vl r62 = r1.A18;
                if (r62.A00().A02 != 1) {
                    r1.A0n.onResume();
                }
                r1.A1W.A00().onResume();
                r1.A1j.onResume();
                C352828Fe r32 = r1.A27;
                C352828Fe.A00(r32, new AnonymousClass9LV(r32, 9));
                r1.A1r.A00().onResume();
                AnonymousClass88F r05 = r1.A22;
                if (r05 != null) {
                    r05.onResume();
                }
                if (r62.A00().A02 != 1 || r1.A2G) {
                    r1.A0S.DmJ(r1.A09);
                }
                AnonymousClass8E6 r06 = r1.A1e;
                if (r06 != null) {
                    r06.A00().onResume();
                }
                if (r1.A1f.CZU()) {
                    C3510387i r24 = r1.A0X;
                    if (r24.A0S.A04 != null) {
                        r24.A06();
                    } else {
                        r24.A0P.A01();
                    }
                }
                r1.A0d.A08();
                userSession = r1.A0R;
                1Ng A003 = AnonymousClass1Nd.A00(userSession);
                A003.A01(r1.A0n, C358018aE.class);
                A003.A01(r1.A0P, C358028aF.class);
                ((C357648Za) r1.A0F.A00.A00()).A01(r1.A0E);
                if (r62.A00().A02 != 1) {
                    r1.A0W.A0A();
                }
                C314676if r25 = r1.A1y;
                if (r25 != null) {
                    C359318cb r7 = (C359318cb) r25.get();
                    IgImageView igImageView = r7.A07;
                    if (r7.A0D == AnonymousClass8YU.PAUSED && igImageView != null && (((C279284yO) r7.A0d.A08.A00) instanceof AnonymousClass80O)) {
                        igImageView.setImageDrawable(r7.A0S.getDrawable(r7.A00));
                        C294975nL.A02(igImageView, 250);
                    }
                }
                27r A012 = 27p.A01(userSession);
                A012.A00.A0B(A012.A04.A05, "owningFragment.isAdded", Boolean.toString(r5.isAdded()), true);
                if (!2D5.A00(userSession).A04.getBoolean("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS_EDUCATION_HAS_SHOWN", false)) {
                    ((AnonymousClass81D) r1.A28.A00.A00()).A03(r5.requireContext(), new C359578d9());
                }
            } catch (IllegalStateException e) {
                userSession = r1.A0R;
                27r A013 = 27p.A01(userSession);
                String obj = e.toString();
                AnonymousClass283 r4 = A013.A04;
                r4.A05 = A013.A00.A07(obj, "", 316094919, r4.A05);
            } catch (Throwable th) {
                0lq.A01();
                27r A014 = 27p.A01(r1.A0R);
                AnonymousClass283 r42 = A014.A04;
                r42.A05 = A014.A00.A02(316094919, r42.A05);
                throw th;
            }
            0lq.A01();
            27r A015 = 27p.A01(userSession);
            AnonymousClass283 r43 = A015.A04;
            r43.A05 = A015.A00.A02(316094919, r43.A05);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r42, int r43, android.content.Intent r44) {
        /*
            r41 = this;
            r5 = r44
            r11 = 9583(0x256f, float:1.3429E-41)
            r9 = 4919(0x1337, float:6.893E-42)
            r1 = 0
            r0 = 1
            r8 = -1
            r7 = r41
            X.80R r4 = r7.A01
            X.80U r2 = r4.A1f
            X.80T r2 = (X.AnonymousClass80T) r2
            X.80W r3 = r2.A01
            r10 = r42
            r6 = r43
            if (r10 != r9) goto L_0x002f
            if (r6 != r8) goto L_0x0029
            X.8Tw r0 = new X.8Tw
            r0.<init>(r6, r5)
        L_0x0020:
            r3.A04(r0)
            X.8Vg r0 = r4.A17
            X.C356798Vg.A00(r0)
        L_0x0028:
            return
        L_0x0029:
            X.8Tx r0 = new X.8Tx
            r0.<init>()
            goto L_0x0020
        L_0x002f:
            android.util.Pair r2 = r3.A00
            java.lang.Object r9 = r2.first
            java.lang.Object r12 = r2.second
            X.80V r2 = X.AnonymousClass80V.RECIPIENT_PICKER
            if (r9 != r2) goto L_0x008e
            boolean r2 = r12 instanceof X.AnonymousClass8SL
            if (r2 == 0) goto L_0x008e
            r2 = r12
            X.8SL r2 = (X.AnonymousClass8SL) r2
            java.lang.Integer r9 = r2.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r9 != r2) goto L_0x008e
        L_0x0046:
            if (r10 != r11) goto L_0x0054
            boolean r2 = r12 instanceof X.C356028Sh
            if (r2 == 0) goto L_0x0054
            X.8Sz r2 = new X.8Sz
            r2.<init>()
            r3.A04(r2)
        L_0x0054:
            r2 = 2
            r9 = 3
            r12 = 0
            if (r10 == r2) goto L_0x0438
            if (r10 == r9) goto L_0x03d4
            r2 = 8
            if (r10 == r2) goto L_0x032d
            r2 = 4217(0x1079, float:5.909E-42)
            if (r10 == r2) goto L_0x02a2
            r2 = 4921(0x1339, float:6.896E-42)
            if (r10 == r2) goto L_0x025d
            r2 = 5150(0x141e, float:7.217E-42)
            if (r10 == r2) goto L_0x024f
            r2 = 5152(0x1420, float:7.22E-42)
            if (r10 == r2) goto L_0x0235
            r9 = 9683(0x25d3, float:1.3569E-41)
            if (r10 == r11) goto L_0x0207
            r2 = 10001(0x2711, float:1.4014E-41)
            if (r10 == r2) goto L_0x0212
            r2 = 2002(0x7d2, float:2.805E-42)
            if (r10 == r2) goto L_0x01eb
            r2 = 2003(0x7d3, float:2.807E-42)
            if (r10 == r2) goto L_0x01c0
            r2 = 9587(0x2573, float:1.3434E-41)
            if (r10 == r2) goto L_0x01af
            r2 = 9588(0x2574, float:1.3436E-41)
            if (r10 == r2) goto L_0x0197
            switch(r42) {
                case 16: goto L_0x0368;
                case 17: goto L_0x0144;
                case 18: goto L_0x03d4;
                default: goto L_0x008a;
            }
        L_0x008a:
            switch(r42) {
                case 9413: goto L_0x00e0;
                case 9414: goto L_0x00bb;
                case 9415: goto L_0x0097;
                default: goto L_0x008d;
            }
        L_0x008d:
            return
        L_0x008e:
            X.8Tw r2 = new X.8Tw
            r2.<init>(r6, r5)
            r3.A04(r2)
            goto L_0x0046
        L_0x0097:
            if (r44 == 0) goto L_0x0028
            r0 = 2494(0x9be, float:3.495E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r2 = r5.getBooleanExtra(r0, r1)
            r0 = 480(0x1e0, float:6.73E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.ArrayList r1 = r5.getStringArrayListExtra(r0)
            if (r2 == 0) goto L_0x0028
            if (r1 == 0) goto L_0x0028
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0028
            r7.A02(r1)
            return
        L_0x00bb:
            if (r44 == 0) goto L_0x0028
            r0 = 295(0x127, float:4.13E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r2 = r5.getStringExtra(r0)
            r0 = 719(0x2cf, float:1.008E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r1 = r5.getStringExtra(r0)
            if (r2 == 0) goto L_0x0028
            if (r1 == 0) goto L_0x0028
            X.8T3 r0 = X.AnonymousClass8T3.A00
            r3.A04(r0)
            X.8Wk r0 = r4.A1D
            r0.A0F(r1)
            return
        L_0x00e0:
            com.instagram.common.session.UserSession r6 = r4.A0R
            X.7vZ r2 = X.C346667vY.A00(r6)
            X.7va r2 = r2.A02
            if (r44 == 0) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            java.lang.String r7 = r2.A01
            r2 = 4494(0x118e, float:6.297E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.util.ArrayList r2 = r5.getParcelableArrayListExtra(r2)
            if (r2 == 0) goto L_0x012d
            java.util.Iterator r5 = r2.iterator()
        L_0x00fe:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x011f
            java.lang.Object r3 = r5.next()
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r3 = (com.instagram.closefriends.audiencelists.model.AudienceListViewModel) r3
            java.lang.String r2 = r3.A01
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x00fe
        L_0x0112:
            X.7vZ r0 = X.C346667vY.A00(r6)
            r0.A02(r3)
        L_0x0119:
            X.8BA r0 = r4.A0e
            r0.A0c()
            return
        L_0x011f:
            X.7vZ r5 = X.C346667vY.A00(r6)
            r6 = r12
            r7 = r12
            r8 = r12
            r9 = r1
            r10 = r0
            r11 = r1
            r5.A03(r6, r7, r8, r9, r10, r11)
            goto L_0x0119
        L_0x012d:
            r0 = 1911(0x777, float:2.678E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r3 = r5.getParcelableExtra(r0)
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r3 = (com.instagram.closefriends.audiencelists.model.AudienceListViewModel) r3
            if (r3 == 0) goto L_0x0119
            java.lang.String r0 = r3.A01
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0119
            goto L_0x0112
        L_0x0144:
            X.8BA r2 = r4.A0e
            if (r6 == r8) goto L_0x0149
            r5 = r12
        L_0x0149:
            X.6if r2 = r2.A1g
            java.lang.Object r8 = r2.get()
            X.8ME r8 = (X.AnonymousClass8ME) r8
            if (r5 == 0) goto L_0x0028
            r2 = 5129(0x1409, float:7.187E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            android.os.Parcelable r6 = r5.getParcelableExtra(r2)
            com.instagram.user.model.ProductCollection r6 = (com.instagram.user.model.ProductCollection) r6
            java.lang.String r2 = "merchant_id"
            java.lang.String r7 = r5.getStringExtra(r2)
            com.instagram.common.session.UserSession r5 = r8.A0r
            X.0t1 r2 = X.0eE.A00(r5)
            com.instagram.user.model.User r2 = r2.A00()
            java.lang.String r4 = r2.getUsername()
            if (r6 == 0) goto L_0x0028
            if (r7 == 0) goto L_0x0028
            java.lang.Integer r3 = r8.A0D
            java.lang.Integer r2 = X.AnonymousClass05K.A04
            if (r3 != r2) goto L_0x0028
            X.Liw r3 = X.C17053VGb.A00(r5)
            X.0iw r2 = r8.A0o
            java.lang.String r2 = r2.getModuleName()
            r3.A01(r1, r0, r2)
            com.instagram.user.model.User r0 = X.1aC.A05(r7, r4)
            X.80U r2 = r8.A1B
            X.8UF r1 = new X.8UF
            r1.<init>((com.instagram.user.model.ProductCollection) r6, (com.instagram.user.model.User) r0)
            goto L_0x03b5
        L_0x0197:
            if (r6 != r9) goto L_0x0028
            X.8WX r2 = r4.A1N
            if (r2 == 0) goto L_0x0028
            X.8XA r0 = r2.A00()
            X.8ic r0 = r0.A01
            if (r0 == 0) goto L_0x0028
            X.8XA r0 = r2.A00()
            X.8ic r0 = r0.A01
            r0.A01(r1)
            return
        L_0x01af:
            if (r6 == r9) goto L_0x01b5
            r0 = 9685(0x25d5, float:1.3572E-41)
            if (r6 != r0) goto L_0x0028
        L_0x01b5:
            X.815 r1 = r4.A10
            X.8Tw r0 = new X.8Tw
            r0.<init>(r6, r5)
            r1.A02(r0)
            return
        L_0x01c0:
            if (r6 != r8) goto L_0x0028
            com.instagram.common.session.UserSession r1 = r4.A0R
            X.1Av r4 = X.1Au.A00(r1)
            X.0s0 r3 = r4.A1Y
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 391(0x187, float:5.48E-43)
            r1 = r2[r1]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.Epx(r4, r0, r1)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r3 = new android.os.Handler
            r3.<init>(r0)
            X.AjW r2 = new X.AjW
            r2.<init>(r7)
            r0 = 100
            r3.postDelayed(r2, r0)
            return
        L_0x01eb:
            if (r44 == 0) goto L_0x0028
            X.8BA r2 = r4.A0e
            boolean r0 = X.AnonymousClass8BA.A0L(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0028
            X.8it r2 = r2.A1q
            r0 = 183(0xb7, float:2.56E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r5.getBooleanExtra(r0, r1)
            r2.A04(r0)
            return
        L_0x0207:
            X.8Vl r2 = r4.A18
            X.8Vm r2 = r2.A00()
            r2.A00 = r0
            if (r6 != r9) goto L_0x0028
            goto L_0x0214
        L_0x0212:
            if (r6 != r8) goto L_0x0028
        L_0x0214:
            X.80D r2 = r4.A0v
            boolean r0 = r2.A3X
            if (r0 == 0) goto L_0x0028
            com.instagram.common.session.UserSession r0 = r4.A0R
            boolean r0 = X.2cg.A01(r0)
            if (r0 == 0) goto L_0x0028
            boolean r0 = r2.A3X
            if (r0 == 0) goto L_0x0028
            android.app.Activity r2 = r4.A09
            r0 = 2130772078(0x7f01006e, float:1.7147264E38)
            r2.overridePendingTransition(r1, r0)
            r2.setResult(r6)
            r2.finish()
            return
        L_0x0235:
            if (r6 != r8) goto L_0x0028
            if (r44 == 0) goto L_0x0028
            r0 = 3995(0xf9b, float:5.598E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r5.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0028
            X.80D r0 = r4.A0v
            X.B2s r1 = r0.A0l
            java.lang.String r0 = "media_posted_to_feed"
            r1.Cpi(r0)
            return
        L_0x024f:
            X.7pK r0 = r4.A1S
            if (r0 == 0) goto L_0x0028
            X.7jO r1 = r0.A00()
            X.28D r0 = r4.A01
            r1.D12(r5, r0, r6)
            return
        L_0x025d:
            X.8Vl r2 = r4.A18
            X.8Vm r2 = r2.A00()
            r2.A05 = r0
            if (r6 != r8) goto L_0x0028
            X.8WX r0 = r4.A1N
            X.8XA r0 = r0.A00()
            r0.A08()
            X.8hG r2 = r7.A00()
            r2.getClass()
            android.app.Activity r9 = r4.A09
            r5.getClass()
            android.net.Uri r10 = r5.getData()
            java.lang.String r15 = r5.getType()
            X.0qQ.A0B(r9, r1)
            com.instagram.common.session.UserSession r11 = r2.A0c
            X.MB4 r8 = new X.MB4
            r13 = r12
            r14 = r12
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0 = 464(0x1d0, float:6.5E-43)
            X.5g0 r1 = new X.5g0
            r1.<init>(r8, r0)
            X.9jX r0 = new X.9jX
            r0.<init>(r2)
            r1.A00 = r0
            X.1ES.A03(r1)
            return
        L_0x02a2:
            if (r44 == 0) goto L_0x0028
            r0 = 456(0x1c8, float:6.39E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r5 = r5.getParcelableExtra(r0)
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r5 = (com.instagram.reels.fragment.model.ReelMoreOptionsModel) r5
            r5.getClass()
            X.8BA r2 = r4.A0e
            X.8C9 r0 = r2.A1D
            r0.A02(r5)
            X.6if r6 = r2.A1g
            java.lang.Object r2 = r6.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            java.util.List r0 = r5.A00()
            r3 = 0
            if (r0 == 0) goto L_0x02d3
            java.util.List r0 = r5.A00()
            java.lang.Object r12 = r0.get(r1)
            com.instagram.pendingmedia.model.BrandedContentTag r12 = (com.instagram.pendingmedia.model.BrandedContentTag) r12
        L_0x02d3:
            X.6if r0 = r2.A1a
            java.lang.Object r0 = r0.get()
            X.AJ2 r0 = (X.AJ2) r0
            X.LPD r2 = r0.A07
            if (r12 == 0) goto L_0x032b
            java.lang.String r0 = r12.A01
        L_0x02e1:
            r2.A04(r0)
            com.instagram.model.shopping.reels.ProfileShopLink r0 = r5.A06
            if (r0 == 0) goto L_0x0311
            java.lang.Object r2 = r6.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            com.instagram.model.shopping.reels.ProfileShopLink r0 = r5.A06
            X.0qQ.A0B(r0, r1)
            java.lang.String r3 = r0.BhF()
            if (r3 != 0) goto L_0x02fa
            r3 = 0
        L_0x02fa:
            X.6if r0 = r2.A1a
        L_0x02fc:
            java.lang.Object r0 = r0.get()
            X.AJ2 r0 = (X.AJ2) r0
            X.LPD r0 = r0.A07
            r0.A04 = r3
        L_0x0306:
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x0028
            X.8Wi r0 = r4.A1C
            if (r0 == 0) goto L_0x0028
            r0.A00 = r1
            return
        L_0x0311:
            com.instagram.model.shopping.reels.ReelProductLink r0 = r5.A08
            if (r0 == 0) goto L_0x0306
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A00
            r0.getClass()
            com.instagram.user.model.User r2 = r0.A0G
            java.lang.Object r0 = r6.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            if (r2 == 0) goto L_0x0328
            java.lang.String r3 = X.AnonymousClass3ZA.A00(r2)
        L_0x0328:
            X.6if r0 = r0.A1a
            goto L_0x02fc
        L_0x032b:
            r0 = 0
            goto L_0x02e1
        L_0x032d:
            X.8BA r0 = r4.A0e
            if (r6 == r8) goto L_0x0332
            r5 = r12
        L_0x0332:
            X.6if r0 = r0.A1g
            java.lang.Object r4 = r0.get()
            X.8ME r4 = (X.AnonymousClass8ME) r4
            if (r5 == 0) goto L_0x0028
            r0 = 2722(0xaa2, float:3.814E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = r5.getStringExtra(r0)
            r0 = 2724(0xaa4, float:3.817E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r5.getStringExtra(r0)
            if (r3 == 0) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            java.lang.Integer r1 = r4.A0D
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            if (r1 != r0) goto L_0x0028
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            com.instagram.user.model.User r0 = X.1aC.A05(r3, r2)
            X.80U r2 = r4.A1B
            X.8UF r1 = new X.8UF
            r1.<init>((com.instagram.user.model.User) r0)
            goto L_0x03b5
        L_0x0368:
            X.8BA r2 = r4.A0e
            if (r6 == r8) goto L_0x036d
            r5 = r12
        L_0x036d:
            X.6if r2 = r2.A1g
            java.lang.Object r6 = r2.get()
            X.8ME r6 = (X.AnonymousClass8ME) r6
            if (r5 == 0) goto L_0x0028
            r2 = 83
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            android.os.Parcelable r2 = r5.getParcelableExtra(r2)
            com.instagram.shopping.intf.productpicker.MultiProductPickerResult r2 = (com.instagram.shopping.intf.productpicker.MultiProductPickerResult) r2
            if (r2 == 0) goto L_0x0028
            java.util.List r4 = r2.A02
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x0028
            java.lang.Integer r3 = r6.A0D
            java.lang.Integer r2 = X.AnonymousClass05K.A04
            if (r3 != r2) goto L_0x0028
            int r2 = r4.size()
            if (r2 != r0) goto L_0x03b9
            java.lang.Object r4 = r4.get(r1)
            com.instagram.user.model.Product r4 = (com.instagram.user.model.Product) r4
            com.instagram.common.session.UserSession r2 = r6.A0r
            X.Liw r3 = X.C17053VGb.A00(r2)
            X.0iw r2 = r6.A0o
            java.lang.String r2 = r2.getModuleName()
            r3.A01(r0, r1, r2)
            X.80U r2 = r6.A1B
            X.8UF r1 = new X.8UF
            r1.<init>((com.instagram.user.model.Product) r4, (java.lang.String) r12)
        L_0x03b5:
            r2.E3H(r1)
            return
        L_0x03b9:
            com.instagram.common.session.UserSession r0 = r6.A0r
            X.Liw r3 = X.C17053VGb.A00(r0)
            int r2 = r4.size()
            X.0iw r0 = r6.A0o
            java.lang.String r0 = r0.getModuleName()
            r3.A01(r2, r1, r0)
            X.80U r2 = r6.A1B
            X.8UF r1 = new X.8UF
            r1.<init>((java.util.List) r4)
            goto L_0x03b5
        L_0x03d4:
            X.8BA r4 = r4.A0e
            if (r6 == r8) goto L_0x03d9
            r5 = r12
        L_0x03d9:
            X.6if r2 = r4.A1g
            java.lang.Object r9 = r2.get()
            X.8ME r9 = (X.AnonymousClass8ME) r9
            if (r5 == 0) goto L_0x0028
            r2 = 366(0x16e, float:5.13E-43)
            java.lang.String r7 = X.AnonymousClass000.A00(r2)
            android.os.Parcelable r8 = r5.getParcelableExtra(r7)
            com.instagram.user.model.Product r8 = (com.instagram.user.model.Product) r8
            r2 = 1844(0x734, float:2.584E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r6 = r5.getStringExtra(r2)
            if (r8 == 0) goto L_0x041a
            java.lang.Integer r3 = r9.A0D
            java.lang.Integer r2 = X.AnonymousClass05K.A04
            if (r3 != r2) goto L_0x041a
            com.instagram.common.session.UserSession r2 = r9.A0r
            X.Liw r3 = X.C17053VGb.A00(r2)
            X.0iw r2 = r9.A0o
            java.lang.String r2 = r2.getModuleName()
            r3.A01(r0, r1, r2)
            X.80U r1 = r9.A1B
            X.8UF r0 = new X.8UF
            r0.<init>((com.instagram.user.model.Product) r8, (java.lang.String) r6)
            r1.E3H(r0)
        L_0x041a:
            r0 = 0
            android.os.Parcelable r1 = r5.getParcelableExtra(r7)
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            if (r1 == 0) goto L_0x0028
            com.instagram.user.model.User r3 = r1.A0B
            X.8C9 r2 = r4.A1D
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r3)
            r2.A05 = r1
            if (r3 == 0) goto L_0x0435
            X.4Cl r0 = r3.A03
            java.lang.String r0 = r0.getUsername()
        L_0x0435:
            r2.A06 = r0
            return
        L_0x0438:
            X.8BA r2 = r4.A0e
            X.6if r2 = r2.A1g
            java.lang.Object r3 = r2.get()
            X.8ME r3 = (X.AnonymousClass8ME) r3
            if (r6 != r8) goto L_0x04b8
            if (r44 == 0) goto L_0x054d
            r2 = 4185(0x1059, float:5.864E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            android.os.Parcelable r8 = r5.getParcelableExtra(r2)
            com.instagram.model.venue.Venue r8 = (com.instagram.model.venue.Venue) r8
            if (r8 == 0) goto L_0x054d
            java.lang.Integer r5 = r3.A0D
            java.lang.Integer r2 = X.AnonymousClass05K.A04
            r10 = 0
            if (r5 != r2) goto L_0x045c
            r10 = 1
        L_0x045c:
            X.80U r5 = r3.A1B
            X.8U8 r2 = new X.8U8
            r2.<init>()
            r5.E3H(r2)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r3.A1m
            java.lang.Class<X.7w8> r2 = X.C347017w8.class
            java.util.ArrayList r2 = r6.A0V(r2)
            java.util.Iterator r9 = r2.iterator()
        L_0x0472:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x04c7
            java.lang.Object r5 = r9.next()
            X.7w8 r5 = (X.C347017w8) r5
            java.lang.Class<X.8uq> r7 = X.C369488uq.class
            boolean r2 = r5.A0E(r7)
            if (r2 == 0) goto L_0x0472
            java.util.ArrayList r3 = r5.A06(r7)
            java.lang.Object r2 = r5.A03
            boolean r0 = r2 instanceof X.C387349m4
            if (r0 == 0) goto L_0x049f
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.model.LocationStickerClientModel"
            X.0qQ.A0C(r2, r0)
            X.9m4 r2 = (X.C387349m4) r2
            com.instagram.model.venue.LocationDictIntf r0 = r8.A00
            com.instagram.model.venue.LocationDict r0 = r0.FG5()
            r2.A00 = r0
        L_0x049f:
            java.util.Iterator r2 = r3.iterator()
        L_0x04a3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04b3
            java.lang.Object r0 = r2.next()
            X.8uq r0 = (X.C369488uq) r0
            r0.A02(r8)
            goto L_0x04a3
        L_0x04b3:
            r6.A0m(r5)
            goto L_0x0550
        L_0x04b8:
            if (r6 != r9) goto L_0x05b2
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r3.A1m
            java.lang.Class<X.8uq> r0 = X.C369488uq.class
            X.7w8 r0 = X.AnonymousClass8ME.A07(r3, r0)
            r2.A0S(r0)
            goto L_0x0550
        L_0x04c7:
            if (r10 != 0) goto L_0x0559
            java.lang.String r2 = "location_sticker_text_tool_attached_subtle"
            java.lang.String[] r2 = new java.lang.String[]{r2, r2, r2}
            java.util.List r7 = X.0sr.A1P(r2)
            com.instagram.common.session.UserSession r9 = r3.A0r
            android.content.Context r6 = r3.A0f
            X.6if r5 = r3.A1e
            java.lang.Object r2 = r5.get()
            X.8an r2 = (X.C358368an) r2
            int r2 = r2.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.7w8 r6 = X.AHM.A01(r6, r9, r8, r2)
            java.lang.Object r2 = r5.get()
            X.8an r2 = (X.C358368an) r2
            X.6Mr r2 = r2.A0T()
            X.0qQ.A07(r2)
            X.AHM.A03(r6, r2)
            r6.setVisible(r1, r1)
            java.lang.String r18 = "StickerOverlayController"
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.6b1 r11 = new X.6b1
            r13 = r12
            r14 = r12
            r16 = r12
            r17 = r12
            r19 = r12
            r20 = r12
            r22 = r21
            r23 = r21
            r24 = r21
            r25 = r21
            r26 = r1
            r27 = r1
            r28 = r1
            r29 = r0
            r30 = r0
            r31 = r1
            r32 = r1
            r33 = r1
            r34 = r0
            r35 = r0
            r36 = r0
            r37 = r0
            r38 = r0
            r39 = r1
            r40 = r1
            r11.<init>((X.AnonymousClass8BH) r12, (X.AnonymousClass8DA) r13, (X.C3510487j) r14, (java.lang.Integer) r15, (java.lang.Integer) r16, (java.lang.Integer) r17, (java.lang.Object) r18, (java.lang.String) r19, (java.util.List) r20, (float) r21, (float) r22, (float) r23, (float) r24, (float) r25, (int) r26, (boolean) r27, (boolean) r28, (boolean) r29, (boolean) r30, (boolean) r31, (boolean) r32, (boolean) r33, (boolean) r34, (boolean) r35, (boolean) r36, (boolean) r37, (boolean) r38, (boolean) r39, (boolean) r40)
            X.6Ly r5 = r3.A15()
            java.lang.String r2 = "location_sticker"
            r3.A0z(r6, r11, r2, r7)
            if (r5 == 0) goto L_0x0556
            X.6if r0 = r3.A1Q
            java.lang.Object r0 = r0.get()
            X.8bk r0 = (X.C358958bk) r0
            r0.A03(r5, r6)
        L_0x054d:
            X.AnonymousClass8ME.A0U(r3)
        L_0x0550:
            X.8QA r0 = r4.A0a
            r0.A0E(r1)
            return
        L_0x0556:
            r3.A0W = r0
            goto L_0x054d
        L_0x0559:
            java.lang.String r7 = "location_sticker_vibrant"
            java.lang.String r6 = "location_sticker_subtle"
            java.lang.String r5 = "location_sticker_rainbow"
            java.lang.String r2 = "location_sticker_hero"
            java.lang.String[] r2 = new java.lang.String[]{r7, r6, r5, r2}
            java.util.List r6 = X.0sr.A1P(r2)
            com.instagram.common.session.UserSession r5 = r3.A0r
            android.content.Context r2 = r3.A0f
            X.7w8 r2 = X.AHM.A01(r2, r5, r8, r12)
            java.lang.String r18 = "StickerOverlayController"
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            r22 = 1075838976(0x40200000, float:2.5)
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.6b1 r11 = new X.6b1
            r13 = r12
            r14 = r12
            r16 = r12
            r17 = r12
            r19 = r12
            r20 = r12
            r23 = r21
            r24 = r21
            r25 = r21
            r26 = r1
            r27 = r0
            r28 = r1
            r29 = r0
            r30 = r0
            r31 = r1
            r32 = r1
            r33 = r1
            r34 = r0
            r35 = r0
            r36 = r0
            r37 = r0
            r38 = r0
            r39 = r1
            r40 = r1
            r11.<init>((X.AnonymousClass8BH) r12, (X.AnonymousClass8DA) r13, (X.C3510487j) r14, (java.lang.Integer) r15, (java.lang.Integer) r16, (java.lang.Integer) r17, (java.lang.Object) r18, (java.lang.String) r19, (java.util.List) r20, (float) r21, (float) r22, (float) r23, (float) r24, (float) r25, (int) r26, (boolean) r27, (boolean) r28, (boolean) r29, (boolean) r30, (boolean) r31, (boolean) r32, (boolean) r33, (boolean) r34, (boolean) r35, (boolean) r36, (boolean) r37, (boolean) r38, (boolean) r39, (boolean) r40)
            java.lang.String r0 = "location_sticker"
            r3.A0z(r2, r11, r0, r6)
            goto L_0x0550
        L_0x05b2:
            X.AnonymousClass8ME.A0U(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass816.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:1|2|(6:4|(2:6|(2:10|(3:18|(3:20|(1:22)|23)|24)))|25|(2:27|(1:29))|30|(2:32|(3:34|(2:37|35)|49)))|38|39|40|41|42|43|44|45) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0126 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConfigurationChanged(android.content.res.Configuration r20) {
        /*
            r19 = this;
            java.lang.String r1 = "QccFragmentLifecycleListener"
            java.lang.String r0 = "#onConfigurationChanged"
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0lq.A02(r0)
            r7 = r19
            X.80R r6 = r7.A01     // Catch:{ all -> 0x012d }
            android.app.Activity r5 = r6.A09     // Catch:{ all -> 0x012d }
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ all -> 0x012d }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x012d }
            r1 = r20
            boolean r0 = X.O3Z.A00(r0, r1)     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x0113
            X.8BA r4 = r6.A0e     // Catch:{ all -> 0x012d }
            X.80D r0 = r4.A18     // Catch:{ all -> 0x012d }
            boolean r0 = r0.A3f     // Catch:{ all -> 0x012d }
            r3 = 0
            r8 = 1
            if (r0 == 0) goto L_0x00ae
            X.8Yz r2 = r4.A0w     // Catch:{ all -> 0x012d }
            X.80m r0 = r2.A08     // Catch:{ all -> 0x012d }
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x012d }
            X.4yO r1 = (X.C279284yO) r1     // Catch:{ all -> 0x012d }
            X.9QA r0 = X.AnonymousClass9QA.A00     // Catch:{ all -> 0x012d }
            if (r1 != r0) goto L_0x00ae
            X.8aL r1 = X.C358088aL.A0o     // Catch:{ all -> 0x012d }
            X.8aL r0 = X.C358088aL.A0p     // Catch:{ all -> 0x012d }
            X.8aL[] r0 = new X.C358088aL[]{r1, r0}     // Catch:{ all -> 0x012d }
            boolean r0 = r2.A0V(r0)     // Catch:{ all -> 0x012d }
            if (r0 != 0) goto L_0x00ae
            X.82o r1 = r4.A14     // Catch:{ all -> 0x012d }
            X.82Y r2 = r1.A01     // Catch:{ all -> 0x012d }
            java.util.List r0 = r2.A0m     // Catch:{ all -> 0x012d }
            int r0 = r0.size()     // Catch:{ all -> 0x012d }
            if (r0 != r8) goto L_0x00ae
            java.lang.Integer r2 = r2.A0D     // Catch:{ all -> 0x012d }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x012d }
            if (r2 == r0) goto L_0x005b
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x012d }
            if (r2 != r0) goto L_0x00ae
        L_0x005b:
            X.6if r0 = r4.A1g     // Catch:{ all -> 0x012d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x012d }
            X.8ME r0 = (X.AnonymousClass8ME) r0     // Catch:{ all -> 0x012d }
            java.util.ArrayList r0 = r0.A17()     // Catch:{ all -> 0x012d }
            boolean r0 = X.C366908ps.A00(r1, r0)     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x00ae
            X.0eK r0 = r4.A1v     // Catch:{ all -> 0x012d }
            java.lang.Object r8 = r0.get()     // Catch:{ all -> 0x012d }
            X.8Wi r8 = (X.C357068Wi) r8     // Catch:{ all -> 0x012d }
            r2 = 1
            if (r8 == 0) goto L_0x00a7
            com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel r9 = r4.A1Q     // Catch:{ all -> 0x012d }
            X.82p r13 = r4.A13     // Catch:{ all -> 0x012d }
            X.8QA r0 = r8.A08     // Catch:{ all -> 0x012d }
            X.8pU r15 = r0.A04()     // Catch:{ all -> 0x012d }
            android.graphics.Bitmap r11 = r8.A05()     // Catch:{ all -> 0x012d }
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r12 = r4.A0z     // Catch:{ all -> 0x012d }
            android.view.View r0 = r4.A0o     // Catch:{ all -> 0x012d }
            android.content.Context r10 = r0.getContext()     // Catch:{ all -> 0x012d }
            X.80x r0 = r8.A0Q     // Catch:{ all -> 0x012d }
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r14 = r0.A00()     // Catch:{ all -> 0x012d }
            r16 = 0
            X.8nd r1 = r1.A01()     // Catch:{ all -> 0x012d }
            X.8nd r0 = X.C365758nd.A07     // Catch:{ all -> 0x012d }
            r18 = 0
            if (r1 != r0) goto L_0x00a2
            r18 = 1
        L_0x00a2:
            r17 = r2
            r9.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x012d }
        L_0x00a7:
            r4.A0h = r2     // Catch:{ all -> 0x012d }
            android.app.Activity r0 = r4.A0n     // Catch:{ all -> 0x012d }
            r0.onBackPressed()     // Catch:{ all -> 0x012d }
        L_0x00ae:
            X.8QA r2 = r6.A0a     // Catch:{ all -> 0x012d }
            boolean r0 = r2.A04     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x00cc
            r2.A0D(r3)     // Catch:{ all -> 0x012d }
            X.82p r0 = r6.A0o     // Catch:{ all -> 0x012d }
            X.82o r0 = r0.A02     // Catch:{ all -> 0x012d }
            X.82Y r0 = r0.A01     // Catch:{ all -> 0x012d }
            boolean r0 = r0.A07()     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x00cc
            X.8Hx r1 = r6.A1j     // Catch:{ all -> 0x012d }
            X.8pU r0 = r2.A05()     // Catch:{ all -> 0x012d }
            r1.EK7(r0)     // Catch:{ all -> 0x012d }
        L_0x00cc:
            X.8hG r0 = r7.A00()     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x0113
            X.8hG r1 = r7.A00()     // Catch:{ all -> 0x012d }
            com.instagram.common.session.UserSession r8 = r1.A0c     // Catch:{ all -> 0x012d }
            X.7zN r7 = X.C348967zN.A00     // Catch:{ all -> 0x012d }
            java.lang.Class<X.7zO> r4 = X.C348977zO.class
            java.lang.Object r0 = r8.A01(r4, r7)     // Catch:{ all -> 0x012d }
            X.7zO r0 = (X.C348977zO) r0     // Catch:{ all -> 0x012d }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x012d }
            r0.clear()     // Catch:{ all -> 0x012d }
            X.7Ge r0 = r1.A0z     // Catch:{ all -> 0x012d }
            java.util.List r1 = r0.Brk()     // Catch:{ all -> 0x012d }
            int r0 = r1.size()     // Catch:{ all -> 0x012d }
            if (r0 <= 0) goto L_0x0113
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x012d }
        L_0x00f7:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x0113
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x012d }
            X.9SZ r1 = (X.AnonymousClass9SZ) r1     // Catch:{ all -> 0x012d }
            java.lang.Object r0 = r8.A01(r4, r7)     // Catch:{ all -> 0x012d }
            X.7zO r0 = (X.C348977zO) r0     // Catch:{ all -> 0x012d }
            com.instagram.common.gallery.model.GalleryItem r2 = r1.A01     // Catch:{ all -> 0x012d }
            android.graphics.Bitmap r1 = r1.A00     // Catch:{ all -> 0x012d }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x012d }
            r0.put(r2, r1)     // Catch:{ all -> 0x012d }
            goto L_0x00f7
        L_0x0113:
            X.4DH r0 = r6.A0J     // Catch:{ all -> 0x012d }
            X.07f r0 = r0.getViewModelStore()     // Catch:{ all -> 0x012d }
            r0.A00()     // Catch:{ all -> 0x012d }
            r0 = r5
            X.07g r0 = (X.AnonymousClass07g) r0     // Catch:{ ConcurrentModificationException -> 0x0126 }
            X.07f r0 = r0.getViewModelStore()     // Catch:{ ConcurrentModificationException -> 0x0126 }
            r0.A00()     // Catch:{ ConcurrentModificationException -> 0x0126 }
        L_0x0126:
            r5.recreate()     // Catch:{ all -> 0x012d }
            X.0lq.A01()
            return
        L_0x012d:
            r0 = move-exception
            X.0lq.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass816.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public final void onDestroyView() {
        AnonymousClass80R r4 = this.A01;
        r4.A18.A00().A0B(AnonymousClass05K.A0N);
        C352888Fl r3 = r4.A0l;
        MediaActionSound mediaActionSound = r3.A0k.A01;
        if (mediaActionSound != null) {
            mediaActionSound.release();
        }
        AnonymousClass6ST r0 = r3.A0F;
        if (r0 != null) {
            r0.dismiss();
            r3.A0F = null;
        }
        AnonymousClass1Nd.A00(r3.A0f).A02(r3.A0d, C359138c4.class);
        14i.A06(r3.A0e);
        AnonymousClass8BA r5 = r4.A0e;
        AnonymousClass8CT r1 = r5.A1A;
        if (r1 != null) {
            if (r1.A05 != null) {
                r1.A05 = null;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        AnonymousClass8C9 r32 = r5.A1D;
        if (r32.A01 != null) {
            AnonymousClass1Nd.A00(r32.A0C).A02(r32.A01, C64679Lg6.class);
        }
        if (r32.A02 != null) {
            AnonymousClass1Nd.A00(r32.A0C).A02(r32.A02, Lg8.class);
        }
        C314676if r12 = r5.A1g;
        if (r12.A03) {
            AnonymousClass8ME r33 = (AnonymousClass8ME) r12.get();
            1Ng A002 = AnonymousClass1Nd.A00(r33.A0r);
            A002.A02(r33.A0p, C354818Nm.class);
            A002.A02(r33.A0q, C354838No.class);
        }
        if (A00() != null) {
            C362048hG A003 = A00();
            ViewGroup viewGroup = A003.A0T;
            0qQ.A0C(viewGroup, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
            ((AppBarLayout) viewGroup).A03(A003);
            RecyclerView recyclerView = A003.A0X;
            recyclerView.A16(A003.A1B);
            recyclerView.A16(A003.A1A);
            recyclerView.A16(A003.A0W);
            recyclerView.A16(A003.A0j);
        }
        AnonymousClass8K4 r02 = r4.A0c;
        AnonymousClass8K4.A07(r02);
        r02.A0C.A01();
        AnonymousClass8LU r03 = r4.A0g;
        AnonymousClass8LU.A09(r03);
        r03.A0b.A01();
        AnonymousClass88F r13 = r4.A22;
        if (r13 != null) {
            r13.A0e = true;
            r13.A0S.clear();
        }
        AnonymousClass8DD r14 = r4.A1I;
        if (r14 != null) {
            r14.A05 = null;
        }
        ((C353318Hd) r4.A1J.A00.A00()).FIy();
        AnonymousClass8VQ.A02();
        r4.A0M.A00().A03();
        C342887pK r04 = r4.A1S;
        if (r04 != null) {
            r04.A00().onDestroyView();
        }
        C353508Hx r05 = r4.A1j;
        if (r05 != null) {
            r05.onDestroyView();
        }
        C314676if r06 = r4.A1y;
        if (r06 != null) {
            C359318cb r34 = (C359318cb) r06.get();
            if (r34.A06 != null) {
                AnonymousClass1Nd.A00(r34.A0b).A02(r34.A06, AnonymousClass8d1.class);
                r34.A06 = null;
            }
        }
        r4.A1t.A00().onDestroyView();
        r4.A1u.A00().onDestroyView();
        C41817B1x b1x = r4.A0v.A0i;
        if (b1x != null) {
            r4.A0W.A0H(new C338877ig(b1x));
        }
        UserSession userSession = r4.A0R;
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36327387440822675L)) {
            C357638Yz r52 = r4.A0W;
            Set<C3495480u> set = r52.A0J;
            for (C3495480u A022 : set) {
                r52.A09.A02(A022);
            }
            set.clear();
            Set<C3495480u> set2 = r52.A0I;
            for (C3495480u A023 : set2) {
                r52.A08.A02(A023);
            }
            set2.clear();
            Set<C3495480u> set3 = r52.A0G;
            for (C3495480u A024 : set3) {
                r52.A07.A02(A024);
            }
            set3.clear();
        }
        AnonymousClass85X r35 = r4.A0n;
        r35.A0P.A0D.clear();
        C357638Yz r2 = r35.A0S;
        r2.A0H(new C3505985i(r35.A0b));
        C3505985i r15 = new C3505985i(r35.A0a);
        r2.A07.A02(r15);
        r2.A0G.remove(r15);
        r4.A1H.A03();
    }

    public final void onPause() {
        AnonymousClass8DH r1;
        this.A02.removeCallbacksAndMessages((Object) null);
        AnonymousClass80R r11 = this.A01;
        r11.A0m.A02 = false;
        ((AnonymousClass80T) r11.A1f).A01.A04(new Object());
        0hq childFragmentManager = r11.A0J.getChildFragmentManager();
        AnonymousClass8ZV A0P = childFragmentManager.A0P(R.id.feed_gallery_fragment_holder);
        if (A0P != null) {
            A0P.A09 = null;
            0s1 r0 = new 0s1(childFragmentManager);
            r0.A03(A0P);
            r0.A00();
        }
        r11.A0l.onPause();
        05G r3 = r11.A1o.A0S;
        if (r3.getValue() == AnonymousClass883.BUILDER_PLAYBACK || r3.getValue() == AnonymousClass883.LANDING_PAGE_PLAYBACK) {
            r3.Epw(AnonymousClass883.PAUSED);
        }
        AnonymousClass8DD r32 = r11.A1I;
        if (r32 != null) {
            if (AnonymousClass8DD.A0C(r32)) {
                AnonymousClass8DM r02 = r32.A0O;
                if (r02 != null) {
                    r02.onPause();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C3502984c r03 = r32.A0J;
            if (!(r03 == null || (r1 = r32.A0P) == null)) {
                ((C357648Za) r03.A00.A00()).A02(r1);
            }
            C3504884v r33 = r32.A0Q;
            r33.A07.A00();
            r33.A06.D0P("on_camera_pause");
            r33.A08.FMl("camera_pause");
        }
        if (A00() != null) {
            A00();
        }
        AnonymousClass8WX r12 = r11.A1N;
        AnonymousClass8XA A002 = r12.A00();
        A002.A04 = false;
        AnonymousClass8XW r04 = A002.A03;
        if (r04 != null) {
            r04.A08();
        }
        r11.A0c.onPause();
        r11.A0g.onPause();
        r11.A0e.onPause();
        AnonymousClass85X r10 = r11.A0n;
        r11.A1W.A00().onPause();
        r11.A1j.onPause();
        r11.A1r.A00().onPause();
        r11.A0a.A0E(false);
        AnonymousClass88F r05 = r11.A22;
        if (r05 != null) {
            r05.onPause();
        }
        C356848Vl r9 = r11.A18;
        if (r9.A00().A02 != 1) {
            r11.A0S.onStop();
            if (r12.A00().A01 != null) {
                C362868ic r2 = r12.A00().A01;
                if (r2.A00 != 0.0f) {
                    int height = r2.A09.getHeight();
                    double d = (double) height;
                    2cs r7 = r2.A0E;
                    if (d != r7.A01 && r7.A09.A00 <= ((double) (((float) height) / 2.0f))) {
                        d = 0.0d;
                    }
                    r7.A08(d, true);
                }
            }
        }
        AnonymousClass84E r06 = r11.A0N;
        if (r06 != null) {
            r06.A00();
        }
        AnonymousClass8E6 r07 = r11.A1e;
        if (r07 != null) {
            r07.A00().onPause();
        }
        r11.A0s.onPause();
        r11.A0X.A07();
        AnonymousClass8VQ.A02();
        if (!r11.A0v.A3h && r9.A00().A00 != 3) {
            r9.A00().A02 = 1;
        }
        1Ng A003 = AnonymousClass1Nd.A00(r11.A0R);
        A003.A02(r10, C358018aE.class);
        A003.A02(r11.A0P, C358028aF.class);
        ((C357648Za) r11.A0F.A00.A00()).A02(r11.A0E);
    }

    public final void onResume() {
        27r A012 = 27p.A01(this.A01.A0R);
        A012.A04.A05 = A012.A00.A04((Integer) null, (String) null, 316094919, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        if (this.A00) {
            this.A02.post(new AnonymousClass8ZT(this));
        } else {
            A01();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0lq.A02(002.A0R("QccFragmentLifecycleListener", "#onSaveInstanceState"));
        try {
            AnonymousClass80R r2 = this.A01;
            C357638Yz r0 = r2.A0W;
            if (r0 != null) {
                bundle.putString("SAVE_INSTANCE_KEY_LAST_CAMERA_DESTINATION", ((C279284yO) r0.A08.A00).A02);
            }
            if (((C357358Xo) r2.A0H.A00.A00()).A06()) {
                bundle.putBoolean("SAVE_INSTANCE_KEY_WAS_SHOWING_MG", true);
            }
            r2.A1j.onSaveInstanceState(bundle);
            AnonymousClass82W r3 = r2.A0M;
            if (!(r3.A00() == null || r3.A00().A05.A09 == null || r3.A00().A05.A09.A0K == null)) {
                bundle.putString("SAVE_INSTANCE_KEY_AR_EFFECT_ID", r3.A00().A05.A09.A0K);
            }
            bundle.putBoolean("SAVE_INSTANCE_KEY_DID_USER_CLOSE_FEED_GALLERY_PICKER", r2.A07);
        } finally {
            0lq.A01();
        }
    }

    public final void onStart() {
        C361388g9 r1;
        0lq.A02(002.A0R("QccFragmentLifecycleListener", "#onStart"));
        try {
            if (A00() != null) {
                C362818iX r12 = A00().A0s;
                if (r12.A0A) {
                    A5G a5g = r12.A00;
                    if (a5g != null) {
                        r1 = a5g.A00;
                    }
                } else {
                    r1 = r12.A07;
                }
                WeakReference weakReference = 1DL.A00;
                1DL.A00 = new WeakReference(r1);
            }
        } finally {
            0lq.A01();
        }
    }

    public AnonymousClass816(AnonymousClass80R r3) {
        this.A01 = r3;
    }

    public final void onStop() {
        if (A00() != null) {
            C362818iX r1 = A00().A0s;
            if (!r1.A0A || r1.A00 != null) {
                WeakReference weakReference = 1DL.A00;
                1DL.A00 = new WeakReference((Object) null);
            }
        }
    }
}
