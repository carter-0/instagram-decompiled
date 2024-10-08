package X;

import android.animation.AnimatorSet;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.model.reels.Reel;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.CameraCapturer;

/* renamed from: X.6hY  reason: invalid class name and case insensitive filesystem */
public final class C314036hY implements AnonymousClass6Z1, C314016hW {
    public float A00;
    public int A01;
    public long A02;
    public long A03;
    public C255773uh A04;
    public C309426Yf A05;
    public C314046hZ A06 = new C314046hZ(this);
    public boolean A07;
    public final UserSession A08;
    public final AnonymousClass3BQ A09;
    public final C310016aI A0A;
    public final C273384mU A0B;
    public final C313056fm A0C;
    public final C273404mW A0D;
    public final C313426gQ A0E;
    public final Map A0F = new LinkedHashMap();

    public C314036hY(UserSession userSession, AnonymousClass3BQ r3, C310016aI r4, C273384mU r5, C313056fm r6, C273404mW r7, C313426gQ r8) {
        0qQ.A0B(r6, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r3, 3);
        0qQ.A0B(r8, 6);
        this.A0C = r6;
        this.A08 = userSession;
        this.A09 = r3;
        this.A0B = r5;
        this.A0D = r7;
        this.A0E = r8;
        this.A0A = r4;
    }

    public final void D7Q(C255773uh r4, C250973mM r5, C316026kz r6, C309426Yf r7) {
        Integer B1a;
        0qQ.A0B(r4, 1);
        0qQ.A0B(r7, 2);
        0qQ.A0B(r5, 3);
        int i = 0;
        if (!this.A07 || !0qQ.A0K(this.A04, r4)) {
            A05();
            this.A04 = r4;
            this.A05 = r7;
            this.A00 = C297785sK.A01(r4, r5, r7);
            C258033yM A0F2 = r4.A0F();
            if (!(A0F2 == null || (B1a = A0F2.B1a()) == null)) {
                i = (B1a.intValue() * IgNetworkConsentStorage.MAX_ENTRIES) + CameraCapturer.OPEN_CAMERA_DELAY_MS;
            }
            this.A01 = i;
            this.A07 = true;
        }
    }

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final /* synthetic */ void DVL() {
    }

    public final void DWT(String str) {
        0qQ.A0B(str, 0);
        if (!str.equals("end_scene") && this.A07 && !A06() && !A01()) {
            C309426Yf r1 = this.A05;
            if (r1 != null) {
                r1.A05(AnonymousClass05K.A00);
                Choreographer.getInstance().removeFrameCallback(this.A06);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void DaV(C255773uh r1, C250973mM r2, C309426Yf r3, float f) {
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void DyN(C255773uh r1, C316036l0 r2) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public static final float A00(C255773uh r1, C250973mM r2, C309426Yf r3) {
        if (r3.A0H > 0) {
            return r3.A0A;
        }
        if (!C309456Yi.A02(r2)) {
            return C297785sK.A01(r1, r2, r3);
        }
        1Xj r0 = r1.A0b;
        if (r0 != null) {
            return (float) C309456Yi.A00(r2, r0.A1B());
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final boolean A01() {
        C309426Yf r0 = this.A05;
        if (r0 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (r0.A0V == null) {
            return true;
        } else {
            return false;
        }
    }

    public final C309406Yd A02() {
        Object obj;
        String str;
        ReboundViewPager reboundViewPager = ((C313046fl) this.A0C).A04;
        View view = reboundViewPager.A0F;
        if (view != null) {
            Object tag = view.getTag();
            if (tag instanceof C309406Yd) {
                return (C309406Yd) tag;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Current view is not an ad. It is \"");
            if (tag == null || (obj = tag.getClass()) == null) {
                obj = "null";
            }
            sb.append(obj);
            sb.append("\". More Info: ");
            C255773uh r1 = this.A04;
            String str2 = "}], ";
            if (r1 != null) {
                sb.append("[{isSponsored: ");
                sb.append(r1.CcK());
                sb.append("}, {adId: ");
                sb.append(r1.A0U(this.A08));
                sb.append(str2);
            } else {
                sb.append("[ReelItem is null!], ");
            }
            C309426Yf r2 = this.A05;
            if (r2 != null) {
                sb.append("[{isEndSceneAvailable: ");
                Integer num = r2.A0V;
                boolean z = false;
                if (num != null) {
                    z = true;
                }
                sb.append(z);
                sb.append("}, {EndSceneState: ");
                if (num != null) {
                    switch (num.intValue()) {
                        case 1:
                            str = "PLAYING";
                            break;
                        case 2:
                            str = "FINISHED";
                            break;
                        case 3:
                            str = "CANCELLED";
                            break;
                        default:
                            str = "PAUSED";
                            break;
                    }
                } else {
                    str = "N/A";
                }
                sb.append(str);
                sb.append("}, {ReelItemStatePosition: ");
                sb.append(r2.A0I);
                sb.append("}, {ViewPagerCurrentIndex: ");
                sb.append(reboundViewPager.A08);
            } else {
                str2 = "[ReelItemState is null!], ";
            }
            sb.append(str2);
            sb.append("[{isBound: ");
            sb.append(this.A07);
            sb.append("}, {isUnset(): ");
            sb.append(A01());
            sb.append("}, {isCancelled(): ");
            C309426Yf r0 = this.A05;
            if (r0 != null) {
                Integer num2 = r0.A0V;
                boolean z2 = false;
                if (num2 == AnonymousClass05K.A0N) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append("}, {isFinished(): ");
                boolean z3 = false;
                if (num2 == AnonymousClass05K.A0C) {
                    z3 = true;
                }
                sb.append(z3);
                sb.append("}, {isPaused(): ");
                sb.append(A06());
                sb.append("}, {isPlaying(): ");
                sb.append(A07());
                sb.append("}]");
                String obj2 = sb.toString();
                0qQ.A07(obj2);
                throw new IllegalStateException(obj2);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A04() {
        if (this.A07 && !A01()) {
            C309426Yf r1 = this.A05;
            if (r1 != null) {
                r1.A05((Integer) null);
                C18510Vt7 A032 = A03();
                AnimatorSet animatorSet = A032.A01;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                C18510Vt7.A00(A032);
                this.A03 = 0;
                Choreographer.getInstance().removeFrameCallback(this.A06);
                Handler handler = ((C313416gP) this.A0E).A0s;
                handler.removeMessages(0);
                handler.sendEmptyMessage(0);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A05() {
        if (this.A07) {
            this.A03 = 0;
            this.A00 = 0.0f;
            for (C18510Vt7 vt7 : this.A0F.values()) {
                AnimatorSet animatorSet = vt7.A01;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                C18510Vt7.A00(vt7);
                vt7.A00 = 0;
            }
            Choreographer.getInstance().removeFrameCallback(this.A06);
            this.A07 = false;
        }
    }

    public final boolean A06() {
        C309426Yf r0 = this.A05;
        if (r0 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (r0.A0V == AnonymousClass05K.A00) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A07() {
        C309426Yf r0 = this.A05;
        if (r0 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (r0.A0V == AnonymousClass05K.A01) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A08() {
        ReboundViewPager reboundViewPager = ((C313046fl) this.A0C).A04;
        View view = reboundViewPager.A0F;
        if (view == null || !(view.getTag() instanceof C309406Yd)) {
            return false;
        }
        C309426Yf r0 = this.A05;
        if (r0 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (r0.A0I == reboundViewPager.A08) {
            return true;
        } else {
            return false;
        }
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
        if (X.182.A06(r3, r2, 36329766852247874L) != false) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Cn1(X.C255773uh r15, X.C250973mM r16, X.C309426Yf r17, float r18) {
        /*
            r14 = this;
            r3 = r18
            r5 = 0
            r8 = r16
            X.0qQ.A0B(r8, r5)
            r11 = 1
            X.0qQ.A0B(r15, r11)
            r4 = 2
            r7 = r17
            X.0qQ.A0B(r7, r4)
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x0313
            X.3BQ r6 = r14.A09
            com.instagram.common.session.UserSession r2 = r14.A08
            boolean r0 = X.C297785sK.A0M(r2, r15, r8, r6, r7)
            if (r0 == 0) goto L_0x0313
            boolean r0 = r14.A08()
            if (r0 == 0) goto L_0x0313
            X.6gQ r12 = r14.A0E
            int r0 = r7.A0H
            if (r0 == 0) goto L_0x02c8
            float r9 = r7.A0A
            int r10 = r12.getCurrentPositionMs()
            r0 = r12
            X.6gP r0 = (X.C313416gP) r0
            int r1 = r0.A03
            int r10 = r10 % r1
            int r0 = r7.A0E
            int r0 = r0 * r1
            int r10 = r10 + r0
            float r0 = (float) r10
            float r0 = r0 / r9
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            if (r0 == 0) goto L_0x02c8
            float r3 = r0.floatValue()
        L_0x0048:
            float r9 = A00(r15, r8, r7)
            r14.A00 = r9
            int r0 = r14.A01
            float r1 = (float) r0
            float r1 = r1 + r9
            float r1 = r1 / r9
            boolean r0 = r14.A01()
            if (r0 == 0) goto L_0x005d
            float r3 = r3 / r1
            r7.A02(r3)
        L_0x005d:
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x02ad
            boolean r0 = r14.A01()
            if (r0 == 0) goto L_0x02ad
            X.6Yf r9 = r14.A05
            if (r9 == 0) goto L_0x030b
            java.lang.Integer r1 = r9.A0V
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x02ad
            java.lang.String r7 = "Required value was null."
            X.3uh r1 = r14.A04
            if (r1 == 0) goto L_0x0305
            boolean r0 = X.C297785sK.A0M(r2, r1, r8, r6, r9)
            if (r0 == 0) goto L_0x02ad
            float r3 = A00(r1, r8, r9)
            r14.A00 = r3
            int r0 = r14.A01
            float r1 = (float) r0
            float r1 = r1 + r3
            r0 = 1132068864(0x437a0000, float:250.0)
            float r3 = r3 - r0
            float r3 = r3 / r1
            float r0 = r9.A0B
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x02ad
            boolean r0 = r14.A08()
            if (r0 == 0) goto L_0x02ad
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x02ad
            boolean r0 = r14.A07()
            if (r0 != 0) goto L_0x02ad
            boolean r0 = r14.A06()
            if (r0 != 0) goto L_0x02ad
            X.6Yf r6 = r14.A05
            if (r6 == 0) goto L_0x02ff
            boolean r0 = r6.A0u
            if (r0 != 0) goto L_0x00cb
            X.0Tu r3 = X.0Tu.A05
            r0 = 36329766852313411(0x8111bb00014143, double:3.0384290734076496E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x00c8
            r0 = 36329766852247874(0x8111bb00004142, double:3.038429073366204E-306)
            boolean r1 = X.182.A06(r3, r2, r0)
            r0 = 0
            if (r1 == 0) goto L_0x00c9
        L_0x00c8:
            r0 = 1
        L_0x00c9:
            r6.A0u = r0
        L_0x00cb:
            X.Vt7 r8 = r14.A03()
            android.animation.AnimatorSet r0 = r8.A01
            if (r0 != 0) goto L_0x02c3
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            r8.A01 = r9
            X.0Tu r3 = X.0Tu.A05
            r0 = 36330892133745478(0x8112c100014346, double:3.0391407059164334E-306)
            boolean r13 = X.182.A06(r3, r2, r0)
            float[] r0 = new float[r4]
            if (r13 == 0) goto L_0x02be
            r0 = {0, 1077936128} // fill-array
        L_0x00ec:
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofFloat(r0)
            int r0 = r8.A00
            double r2 = (double) r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 * r0
            long r0 = (long) r2
            android.animation.ValueAnimator r1 = r10.setDuration(r0)
            X.W4J r0 = new X.W4J
            r0.<init>(r8, r13)
            r1.addUpdateListener(r0)
            float[] r0 = new float[r4]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            android.animation.ValueAnimator r13 = r2.setDuration(r0)
            X.W4A r3 = new X.W4A
            r3.<init>(r8)
            r13.addUpdateListener(r3)
            X.Usd r3 = new X.Usd
            r3.<init>(r8)
            r2.addListener(r3)
            float[] r3 = new float[r4]
            r3 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
            android.animation.ValueAnimator r1 = r3.setDuration(r0)
            X.W4B r0 = new X.W4B
            r0.<init>(r8)
            r1.addUpdateListener(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            r3.setInterpolator(r0)
            r10.setInterpolator(r0)
            r0 = 400(0x190, double:1.976E-321)
            r3.setStartDelay(r0)
            android.animation.Animator[] r0 = new android.animation.Animator[]{r10, r2, r3}
            r9.playTogether(r0)
        L_0x0151:
            X.C18510Vt7.A00(r8)
            android.animation.AnimatorSet r1 = r8.A01
            if (r1 == 0) goto L_0x0165
            android.view.View r0 = r8.A08
            r0.bringToFront()
            android.view.View r0 = r8.A05
            r0.setVisibility(r5)
            r1.start()
        L_0x0165:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r6.A05(r0)
            X.6hZ r3 = r14.A06
            X.6hY r2 = r3.A00
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A02 = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r0.postFrameCallback(r3)
            X.6Yd r1 = r14.A02()
            r0 = 8
            r1.EqF(r0)
            X.4mU r0 = r14.A0B
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.3mM r6 = r0.A0a
            if (r6 == 0) goto L_0x019b
            X.3uh r0 = r14.A04
            if (r0 == 0) goto L_0x02f9
            boolean r0 = X.C297785sK.A0i(r0, r6)
            if (r0 == 0) goto L_0x019b
            java.lang.String r0 = "end_scene_truncated_long_video"
            r12.E21(r0)
        L_0x019b:
            X.3uh r7 = r14.A04
            X.6aI r4 = r14.A0A
            if (r4 == 0) goto L_0x02ad
            if (r7 == 0) goto L_0x02ad
            if (r6 == 0) goto L_0x02ad
            boolean r0 = r7.CWu()
            if (r0 == 0) goto L_0x02ad
            boolean r0 = r7.CcK()
            if (r0 == 0) goto L_0x02ad
            X.1Xj r8 = r7.A0b
            r8.getClass()
            com.instagram.common.session.UserSession r2 = r4.A06
            com.instagram.model.reels.Reel r0 = r6.A0H
            X.6aJ r1 = X.C310016aI.A01(r0, r4)
            java.lang.String r0 = "end_scene"
            X.3sc r3 = X.C254513sb.A04(r8, r1, r0)
            r3.A0G(r2, r8)
            java.lang.String r0 = X.C231122qu.A07(r2, r8)
            r3.A4N = r0
            X.3kK r0 = r4.A0E
            java.lang.String r0 = r0.getSessionId()
            r3.A6t = r0
            java.lang.String r0 = r8.getId()
            r3.A5u = r0
            X.1iA r0 = r8.BR7()
            r3.A0N(r0)
            boolean r0 = X.C297785sK.A0i(r7, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A1b = r0
            X.0qQ.A0B(r2, r5)
            X.0kM r1 = new X.0kM
            r1.<init>(r2)
            X.6aJ r0 = r4.A0A
            r1.A00 = r0
            X.0kJ r0 = X.0kJ.A05
            r1.A01(r0)
            X.0wc r2 = r1.A00()
            java.lang.String r1 = "ig_story_ads_end_scene_event"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            X.0jB r3 = r3.A01()
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x02ad
            X.0j9 r0 = X.C271774jZ.A5a
            java.io.Serializable r0 = r3.A01(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x02bb
            long r0 = r0.longValue()
            int r4 = (int) r0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x0226:
            X.0j9 r0 = X.C271774jZ.A4R
            java.io.Serializable r0 = r3.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r6 = 0
            if (r0 == 0) goto L_0x02b8
            boolean r4 = r0.booleanValue()
        L_0x0235:
            java.lang.String r1 = "shown"
            java.lang.String r0 = "event"
            r2.AAJ(r0, r1)
            X.0j9 r0 = X.C271774jZ.A4I
            java.io.Serializable r0 = r3.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x02b6
            boolean r0 = r0.booleanValue()
        L_0x024a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_follower_count_shown"
            r2.A7p(r0, r1)
            X.0j9 r0 = X.C271774jZ.A4Q
            java.io.Serializable r0 = r3.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0261
            boolean r6 = r0.booleanValue()
        L_0x0261:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "is_join_date_shown"
            r2.A7p(r0, r1)
            X.0j9 r0 = X.C271774jZ.A0B
            java.io.Serializable r1 = r3.A01(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "ad_id"
            r2.AAJ(r0, r1)
            X.0j9 r0 = X.C271774jZ.A5I
            java.io.Serializable r1 = r3.A01(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "instagram_media_id"
            r2.AAJ(r0, r1)
            X.0j9 r0 = X.C271774jZ.A7x
            java.io.Serializable r1 = r3.A01(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = X.C46346Dcp.A00()
            r2.AAJ(r0, r1)
            X.1iA r0 = X.1i9.A00(r7)
            if (r0 == 0) goto L_0x02b4
            int r0 = r0.ordinal()
            if (r0 == r5) goto L_0x02b1
            if (r0 != r11) goto L_0x02b4
            if (r4 == 0) goto L_0x02ae
            java.lang.String r1 = "long_video"
        L_0x02a5:
            java.lang.String r0 = "media_type"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x02ad:
            return r11
        L_0x02ae:
            java.lang.String r1 = "video"
            goto L_0x02a5
        L_0x02b1:
            java.lang.String r1 = "single_image"
            goto L_0x02a5
        L_0x02b4:
            r1 = 0
            goto L_0x02a5
        L_0x02b6:
            r0 = 0
            goto L_0x024a
        L_0x02b8:
            r4 = 0
            goto L_0x0235
        L_0x02bb:
            r7 = 0
            goto L_0x0226
        L_0x02be:
            r0 = {0, 1065353216} // fill-array
            goto L_0x00ec
        L_0x02c3:
            r0.cancel()
            goto L_0x0151
        L_0x02c8:
            boolean r0 = X.C309456Yi.A02(r8)
            if (r0 == 0) goto L_0x02d2
            float r3 = r7.A0B
            goto L_0x0048
        L_0x02d2:
            int r1 = r12.getCurrentPositionMs()
            boolean r0 = X.C297785sK.A0i(r15, r8)
            if (r0 == 0) goto L_0x0048
            boolean r0 = X.C297785sK.A0o(r8, r7)
            if (r0 != 0) goto L_0x0048
            float r3 = (float) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r0
            X.1Xj r0 = r15.A0b
            r0.getClass()
            double r0 = X.C297785sK.A00(r0)
            r9 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r9
            float r9 = (float) r0
            float r3 = r3 / r9
            goto L_0x0048
        L_0x02f9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x02ff:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0305:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x030b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0313:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314036hY.Cn1(X.3uh, X.3mM, X.6Yf, float):boolean");
    }

    public final void Dfe() {
        if (this.A07 && !A07() && !A01()) {
            C309426Yf r1 = this.A05;
            if (r1 != null) {
                r1.A05(AnonymousClass05K.A01);
                C314046hZ r3 = this.A06;
                r3.A00.A02 = SystemClock.elapsedRealtime();
                Choreographer.getInstance().postFrameCallback(r3);
                this.A0B.EHY("end_scene");
                C18510Vt7 A032 = A03();
                AnimatorSet animatorSet = A032.A01;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                A032.A08.bringToFront();
                View view = A032.A05;
                view.setVisibility(0);
                view.setAlpha(1.0f);
                A032.A07.setAlpha(1.0f);
                View view2 = A032.A06;
                view2.setAlpha(1.0f);
                view2.setTranslationY(0.0f);
                View view3 = A032.A04;
                view3.setAlpha(0.0f);
                view3.setTranslationY((float) A032.A02);
                view3.setVisibility(8);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final /* synthetic */ boolean Dqd() {
        return false;
    }

    public final C18510Vt7 A03() {
        C307266Pl r3 = A02().A0S;
        Map map = this.A0F;
        Object obj = map.get(r3);
        if (obj == null) {
            obj = new C18510Vt7(r3, this.A01);
            map.put(r3, obj);
        }
        return (C18510Vt7) obj;
    }

    public final void onDestroyView() {
        A05();
    }
}
