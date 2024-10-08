package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.lang.ref.WeakReference;

/* renamed from: X.6Yo  reason: invalid class name and case insensitive filesystem */
public final class C309516Yo {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Fragment A05;
    public 0hq A06;
    public C267664bz A07;
    public VRQ A08;
    public AnonymousClass0iw A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public Bundle A0I;
    public C71002Zj A0J;
    public final 0lg A0K;
    public final WeakReference A0L;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if ((r5 instanceof X.C249493js) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C309516Yo(androidx.fragment.app.FragmentActivity r5, X.0lg r6) {
        /*
            r4 = this;
            r1 = 1
            X.0qQ.A0B(r5, r1)
            r4.<init>()
            if (r6 == 0) goto L_0x006a
            r4.A0K = r6
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r4.A0L = r0
            r4.A0D = r1
            r3 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            r4.A02 = r3
            boolean r2 = r5 instanceof X.AnonymousClass2ZV
            if (r2 == 0) goto L_0x0057
            r1 = r5
            X.2ZV r1 = (X.AnonymousClass2ZV) r1
            boolean r0 = r1.CXf()
            if (r0 == 0) goto L_0x0057
            X.4DF r0 = r1.BTU()
            if (r0 == 0) goto L_0x0057
            X.Mey r0 = X.AnonymousClass4DF.A01(r0)
            if (r0 == 0) goto L_0x0062
            X.0hq r0 = r0.getChildFragmentManager()
            X.0qQ.A07(r0)
            r4.A06 = r0
            r3 = 2131429903(0x7f0b0a0f, float:1.8481492E38)
        L_0x003e:
            r4.A02 = r3
        L_0x0040:
            if (r2 == 0) goto L_0x004a
            boolean r0 = r5 instanceof X.C71002Zj
            if (r0 == 0) goto L_0x004a
            X.2Zj r5 = (X.C71002Zj) r5
            r4.A0J = r5
        L_0x004a:
            androidx.fragment.app.Fragment r1 = r4.A00()
            boolean r0 = r1 instanceof X.AnonymousClass0iw
            if (r0 == 0) goto L_0x0056
            X.0iw r1 = (X.AnonymousClass0iw) r1
            r4.A09 = r1
        L_0x0056:
            return
        L_0x0057:
            X.0hq r0 = X.C229102mq.A00(r5)
            r4.A06 = r0
            boolean r0 = r5 instanceof X.C249493js
            if (r0 == 0) goto L_0x0040
            goto L_0x003e
        L_0x0062:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x006a:
            java.lang.String r1 = "Session cannot be null for FragmentNavigator"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309516Yo.<init>(androidx.fragment.app.FragmentActivity, X.0lg):void");
    }

    public final void A06() {
        A0G((String) null, 0);
    }

    public final void A08() {
        this.A0F = true;
    }

    public final void A0B(Bundle bundle, Fragment fragment) {
        0qQ.A0B(fragment, 0);
        this.A05 = fragment;
        this.A0I = bundle;
    }

    public final void A0D(Fragment fragment) {
        A0B((Bundle) null, fragment);
    }

    public final void A0E(Fragment fragment) {
        0qQ.A0B(fragment, 0);
        A0B((Bundle) null, fragment);
    }

    private final Fragment A00() {
        0kg r2;
        String str;
        String str2;
        WeakReference weakReference = this.A0L;
        if (weakReference.get() == null) {
            r2 = 0kg.A0A;
            str = "FragmentNavigator";
            str2 = "Activity reference is null when finding current fragment";
        } else {
            Activity activity = (Activity) weakReference.get();
            if (activity == null || activity.findViewById(this.A02) == null) {
                r2 = 0kg.A0A;
                str = "FragmentNavigator";
                str2 = "FragmentNavigator couldn't find fragment layout id";
            }
            return this.A06.A0P(this.A02);
        }
        A01(r2, str, str2);
        return this.A06.A0P(this.A02);
    }

    private final void A01(0kg r3, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(", in activity ");
        sb.append(this.A0L.get());
        sb.append(", with nav_events: ");
        1Rm A002 = 1Rm.A00();
        0qQ.A07(A002);
        String A012 = A002.A01();
        0qQ.A07(A012);
        sb.append(A012);
        0wb.A01(r3, str, sb.toString());
    }

    private final void A02(Integer num) {
        int i;
        String str;
        Bundle bundle;
        int i2;
        int i3;
        int i4;
        int A0J2;
        Throwable th;
        int i5;
        int i6;
        if (Systrace.A0E(1)) {
            0fS.A01("FragmentNavigator.transitionInternal", -1044244961);
        }
        try {
            Fragment fragment = this.A05;
            if (fragment != null) {
                0lg r6 = this.A0K;
                Fragment A002 = C227912kJ.A00(fragment, r6);
                AnonymousClass0iw r7 = this.A09;
                if (r7 != null) {
                    2cc A003 = C71342cb.A00(r6);
                    int A0M = this.A06.A0M();
                    A003.A0B(this.A07, r7, this.A0B, A0M);
                }
                Bundle bundle2 = this.A0I;
                if (bundle2 != null && !bundle2.isEmpty()) {
                    Bundle bundle3 = A002.mArguments;
                    if (bundle3 == null) {
                        A002.setArguments(this.A0I);
                    } else {
                        bundle3.putAll(this.A0I);
                    }
                }
                Fragment A004 = A00();
                Fragment fragment2 = this.A05;
                if (fragment2 == null) {
                    A01(0kg.A0A, "FragmentNavigator", "Fragment is null when adding user info");
                } else {
                    if (A004 == null || (bundle = A004.mArguments) == null || (str = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY")) == null) {
                        str = r6.getToken();
                    }
                    Bundle bundle4 = fragment2.mArguments;
                    if (bundle4 == null) {
                        bundle4 = new Bundle();
                    }
                    String string = bundle4.getString("IgSessionManager.SESSION_TOKEN_KEY");
                    if (string == null || string.length() == 0) {
                        bundle4.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
                    }
                    fragment2.setArguments(bundle4);
                }
                0hq r5 = this.A06;
                0s1 r2 = new 0s1(r5);
                int i7 = this.A00;
                if (i7 != 0 || this.A01 != 0 || this.A03 != 0 || this.A04 != 0) {
                    i2 = this.A01;
                    i3 = this.A03;
                    i4 = this.A04;
                    r2.A07(i7, i2, i3, i4);
                } else if (AnonymousClass2Rc.A00) {
                    if (this.A0E) {
                        r2.A07(R.anim.modal_slide_up_enter, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.modal_slide_down_exit);
                    } else if (this.A0F) {
                        i7 = R.anim.fragment_slide_left_enter;
                        i2 = R.anim.fragment_slide_left_exit;
                        i3 = R.anim.fragment_slide_right_enter;
                        i4 = R.anim.fragment_slide_right_exit;
                        r2.A07(i7, i2, i3, i4);
                    } else if (this.A0H) {
                        r2.A07(R.anim.fragment_slide_up_enter, 0, 0, 0);
                    }
                }
                String str2 = this.A0C;
                if (str2 == null || str2.length() == 0) {
                    str2 = A002.getClass().getCanonicalName();
                    this.A0C = str2;
                }
                Integer num2 = num;
                if (num2 == AnonymousClass05K.A00) {
                    r2.A0C(A002, str2, this.A02);
                } else if (num2 == AnonymousClass05K.A01) {
                    r2.A0D(A002, str2, this.A02);
                }
                if (this.A0D) {
                    r2.A0I(this.A0A);
                }
                if (this.A0G) {
                    A0J2 = r2.A0J(true);
                } else {
                    A0J2 = r2.A0J(false);
                }
                VRQ vrq = this.A08;
                if (vrq != null) {
                    if (Systrace.A0E(1)) {
                        0fS.A01("onCommitListener.onCommit", -1860260342);
                    }
                    vrq.A00.putInt("__key_screen_transaction_id", A0J2);
                    if (Systrace.A0E(1)) {
                        0fS.A00(1051517430);
                    }
                }
                if (!182.A06(0Tu.A05, r6, 36330131924468187L)) {
                    if (Systrace.A0E(1)) {
                        0fS.A01("executePendingTransactions", -1147835264);
                    }
                    try {
                        r5.A0a();
                        if (Systrace.A0E(1)) {
                            0fS.A00(-1805295201);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (Systrace.A0E(1)) {
                            i5 = -554842979;
                            0fS.A00(i5);
                        }
                        throw th;
                    }
                }
                InstagramMainActivity instagramMainActivity = this.A0J;
                if (instagramMainActivity != null) {
                    if (Systrace.A0E(1)) {
                        0fS.A01("delegate.maybeUpdateToMainPanel", -60181037);
                    }
                    try {
                        2b7 r0 = instagramMainActivity.A09;
                        if (r0 != null) {
                            2bB r22 = r0.A02;
                            if (r22.A0K != null && r22.A0H()) {
                                if (!Pxd.A00(53).equals(A002.mTag)) {
                                    if (182.A06(0Tu.A06, r22.A0P, 36317543377671466L)) {
                                        r22.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, "back", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false));
                                        Fragment A0P = r22.A0O.getSupportFragmentManager().A0P(R.id.layout_container_main);
                                        if (A0P != null) {
                                            i6 = A0P.getChildFragmentManager().A0M();
                                        } else {
                                            i6 = r22.A03;
                                        }
                                        r22.A03 = i6;
                                    }
                                }
                            }
                        }
                        if (Systrace.A0E(1)) {
                            0fS.A00(-675528162);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (Systrace.A0E(1)) {
                            i5 = 2138019491;
                            0fS.A00(i5);
                        }
                        throw th;
                    }
                }
                if (Systrace.A0E(1)) {
                    i = 126317303;
                } else {
                    return;
                }
            } else {
                A01(0kg.A0A, "FragmentNavigator", "Fragment is null when attempting transition");
                if (Systrace.A0E(1)) {
                    i = 1818800441;
                } else {
                    return;
                }
            }
            0fS.A00(i);
        } catch (Throwable th4) {
            if (Systrace.A0E(1)) {
                0fS.A00(-2132101572);
            }
            throw th4;
        }
    }

    public final void A03() {
        A02(AnonymousClass05K.A00);
    }

    public final void A04() {
        A02(AnonymousClass05K.A01);
    }

    public final void A05() {
        if (AnonymousClass06S.A01(this.A06)) {
            this.A0G = false;
        } else {
            this.A0G = true;
            A01(0kg.A09, "FragmentNavigator_commit_allowing_state_loss", "Committing transaction allowing stateLoss for onClick event");
        }
        A02(AnonymousClass05K.A01);
    }

    public final void A07() {
        11Z.A03(new C19984Wiv(this));
    }

    public final void A0A(int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = i4;
    }

    public final void A0C(Fragment fragment) {
        0hq r1 = this.A06;
        0s1 r0 = new 0s1(r1);
        r0.A03(fragment);
        r0.A00();
        r1.A0a();
    }

    public final void A0F(Fragment fragment, int i) {
        Fragment fragment2 = this.A05;
        if (fragment2 != null) {
            fragment2.setTargetFragment(fragment, i);
        } else {
            A01(0kg.A0A, "FragmentNavigator", "Fragment is null when setting target fragment");
        }
    }

    public final void A0G(String str, int i) {
        AnonymousClass0iw r4 = this.A09;
        if (r4 != null) {
            2cc A002 = C71342cb.A00(this.A0K);
            int A0M = this.A06.A0M();
            A002.A0B(this.A07, r4, this.A0B, A0M);
        }
        this.A06.A0y(str, i);
    }

    public final void A09() {
        A0A(R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out);
    }
}
