package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

public final class H1V extends AnonymousClass4DH implements C268594df, C59607JQb {
    public static final String __redex_internal_original_name = "CommentComposerModalFragment";
    public 1Xj A00;
    public AnonymousClass4DU A01;
    public C234072ww A02;
    public IOA A03;
    public C247733gp A04;
    public C249763kK A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass0eM A0D = C227642jf.A02(this);

    public final int AqL() {
        return -2;
    }

    public final float CMx() {
        return 1.0f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMu(int i) {
        int i2;
        AnonymousClass37D A0i;
        this.A0B = true;
        FragmentActivity activity = getActivity();
        if (activity == null || (A0i = DbT.A0i(activity)) == null) {
            i2 = 0;
        } else {
            i2 = A0i.A08();
        }
        int i3 = i2 - i;
        IOA ioa = this.A03;
        if (ioa == null) {
            0qQ.A0F("commentComposerController");
            throw AnonymousClass00P.createAndThrow();
        }
        ioa.A00 = i3;
        IOA.A01(ioa);
    }

    public final boolean Erf() {
        return true;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(this);
    }

    public static final void A00(H1V h1v) {
        1Xj r3 = h1v.A00;
        if (r3 != null) {
            IOA ioa = h1v.A03;
            if (ioa == null) {
                0qQ.A0F("commentComposerController");
                throw AnonymousClass00P.createAndThrow();
            }
            if (ioa.A03 != r3) {
                ioa.A03 = r3;
                IOA.A04(ioa);
            }
            IOA.A02(ioa);
            Context requireContext = h1v.requireContext();
            User A2A = r3.A2A(AnonymousClass7TE.A0l(h1v.A0D));
            if (A2A != null) {
                h1v.A06 = DbY.A0b(requireContext, A2A, 2131956420);
                h1v.A07 = h1v.requireContext().getString(2131961760);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return false;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
    }

    public final void DMt() {
        if (this.A0B) {
            DbZ.A17(this);
        }
    }

    public final void DYQ() {
        1xC r2 = 1xC.A01;
        C310336ap A0X = DbV.A0X();
        A0X.A0D = this.A06;
        DbY.A1K(r2, A0X);
    }

    public final void DYR(C247733gp r6, Map map) {
        String str = r6.A0C;
        List list = r6.A0M;
        1Xj r3 = this.A00;
        if (list == null || list.isEmpty() || r3 == null) {
            1xC r2 = 1xC.A01;
            C310336ap A0X = DbV.A0X();
            A0X.A0H = "post_comment_failed";
            if (str == null || str.length() == 0) {
                str = this.A07;
            }
            A0X.A0D = str;
            DbY.A1K(r2, A0X);
            return;
        }
        AnonymousClass0eM r1 = this.A0D;
        r3.AE7(DbT.A0X(r1));
        1Ng A0R = DbX.A0R(r1);
        String str2 = this.A08;
        if (str2 == null) {
            0qQ.A0F("entryPoint");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A0R.A00(new AnonymousClass3K9(r6, r3, str2));
        }
    }

    public final void DYS(C247733gp r3, boolean z) {
        1Xj r1 = this.A00;
        if (r1 != null) {
            r1.AE7(DbT.A0X(this.A0D));
        }
        DbZ.A17(this);
    }

    public final void DYT(C247733gp r7, String str) {
        1Xj r4 = this.A00;
        if (r4 != null) {
            AnonymousClass0eM r5 = this.A0D;
            DbX.A0R(r5).A00(new C57072INm(r7, r4, this.A09));
            if (this.A0C) {
                boolean equals = DbX.A0l(AnonymousClass0t1.A01, r5).equals(r4.A2A(AnonymousClass7TE.A0l(r5)));
                2MD A012 = 2MD.A01();
                OIS A002 = OU0.A00(DbU.A0u(r5));
                A002.A0G = "post_comment_succeeded_notification_type";
                String str2 = this.A0A;
                if (str2 == null) {
                    0qQ.A0F("notificationTitle");
                    throw AnonymousClass00P.createAndThrow();
                }
                A002.A0H = str2;
                A002.A0E = r7.A0d;
                A002.A03 = PushChannelType.LOCAL;
                A002.A08 = new IVK(this, r7, r4, equals);
                A012.A09(new OU0(A002));
            }
            r4.AE7(DbT.A0X(r5));
        }
    }

    public final String getModuleName() {
        return 002.A0R("modal_comment_composer_", requireArguments().getString(AnonymousClass000.A00(897)));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r6.length() == 0) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBottomSheetClosed() {
        /*
            r8 = this;
            X.IOA r0 = r8.A03
            java.lang.String r7 = "commentComposerController"
            if (r0 == 0) goto L_0x000c
            X.HrN r0 = r0.A02
            if (r0 != 0) goto L_0x0014
            java.lang.String r7 = "viewHolder"
        L_0x000c:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0014:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r0.A0D
            X.0nA.A0N(r0)
            X.1Xj r2 = r8.A00
            X.3gp r0 = r8.A04
            if (r0 != 0) goto L_0x008a
            if (r2 == 0) goto L_0x008a
            java.lang.String r0 = r2.getId()
            if (r0 == 0) goto L_0x008a
            X.IOA r0 = r8.A03
            if (r0 == 0) goto L_0x000c
            java.lang.CharSequence r6 = r0.A07()
            X.0eM r0 = r8.A0D
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7a2 r5 = X.C333727a1.A00(r0)
            if (r6 == 0) goto L_0x0042
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x0043
        L_0x0042:
            r0 = 1
        L_0x0043:
            java.lang.String r4 = ""
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = r2.getId()
            if (r0 == 0) goto L_0x004e
            r4 = r0
        L_0x004e:
            r3 = 0
            X.IOA r0 = r8.A03
            if (r0 == 0) goto L_0x000c
            X.7bB r0 = r0.A01
            if (r0 != 0) goto L_0x007a
            java.lang.String r7 = "mentionThumbnailSelectionDelegate"
            goto L_0x000c
        L_0x005a:
            java.lang.String r0 = r2.getId()
            if (r0 != 0) goto L_0x0061
            r0 = r4
        L_0x0061:
            java.util.Map r1 = r5.A00
            java.lang.Object r0 = r1.get(r0)
            X.9JD r0 = (X.AnonymousClass9JD) r0
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = r2.getId()
            if (r0 == 0) goto L_0x0076
            r4 = r0
        L_0x0076:
            r1.remove(r4)
            return
        L_0x007a:
            X.7a4 r2 = r0.A00
            r0 = 3
            X.0qQ.A0B(r6, r0)
            X.9JD r1 = new X.9JD
            r1.<init>((X.AnonymousClass7a4) r2, (java.lang.CharSequence) r6, (java.lang.String) r3, (java.lang.String) r3)
            java.util.Map r0 = r5.A00
            r0.put(r4, r1)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1V.onBottomSheetClosed():void");
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-1410668521);
        H1V.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = new ITX(getModuleName(), requireArguments.getBoolean(AnonymousClass000.A00(895)), requireArguments.getBoolean(AnonymousClass000.A00(894)));
        String str = "";
        CharSequence charSequence = requireArguments.getCharSequence(AnonymousClass000.A00(2171), str);
        if (charSequence != null) {
            this.A08 = C320236s2.A01(requireArguments, AnonymousClass000.A00(892));
            this.A09 = requireArguments.getString(AnonymousClass000.A00(3387), (String) null);
            boolean z = requireArguments.getBoolean(AnonymousClass000.A00(3394), false);
            this.A0C = z;
            if (z) {
                this.A0A = getString(2131969673);
            }
            this.A05 = AnonymousClass1L1.A01.A01(requireArguments.getString(AnonymousClass000.A00(896), (String) null));
            AnonymousClass4DU r7 = this.A01;
            if (r7 != null) {
                AnonymousClass0eM r9 = this.A0D;
                UserSession A0l = AnonymousClass7TE.A0l(r9);
                C249763kK r1 = this.A05;
                String str2 = "sessionIdProvider";
                if (r1 != null) {
                    this.A02 = new C234072ww(A0l, r7, r1);
                    String string = requireArguments.getString(AnonymousClass000.A00(3389));
                    String string2 = requireArguments.getString(AnonymousClass000.A00(3390));
                    if (string != null) {
                        DDf A002 = C65211bM.A00.A00();
                        A002.A0r = string;
                        if (string2 != null) {
                            str = string2;
                        }
                        A002.A0t = str;
                        this.A04 = new C247733gp(A002.A02());
                        String string3 = requireArguments.getString(AnonymousClass000.A00(3391));
                        SimpleImageUrl simpleImageUrl = User.A08;
                        User user = new User(string3, requireArguments.getString(AnonymousClass000.A00(3393)));
                        user.A0u(requireArguments.getString(AnonymousClass000.A00(3392)));
                        C247733gp r0 = this.A04;
                        if (r0 != null) {
                            r0.A08 = user;
                        }
                    }
                    Context requireContext = requireContext();
                    UserSession A0l2 = AnonymousClass7TE.A0l(r9);
                    String str3 = this.A08;
                    if (str3 == null) {
                        str2 = "entryPoint";
                    } else {
                        AnonymousClass4DU r12 = this.A01;
                        if (r12 != null) {
                            C234072ww r15 = this.A02;
                            if (r15 == null) {
                                str2 = "commentsLogger";
                            } else {
                                C249763kK r02 = this.A05;
                                if (r02 != null) {
                                    C247733gp r8 = this.A04;
                                    C247733gp r18 = r8;
                                    AnonymousClass4DU r19 = r12;
                                    C249763kK r20 = r02;
                                    String str4 = str3;
                                    this.A03 = new IOA(requireContext, this, r15, this, A0l2, r18, r19, r20, charSequence, str4, requireArguments.getInt(AnonymousClass000.A00(2175), -1), requireArguments.getInt(AnonymousClass000.A00(2173), 0), requireArguments.getInt(AnonymousClass000.A00(2176), -1), requireArguments.getBoolean("intent_extra_show_keyboard_delayed_on_open", false), requireArguments.getBoolean(AnonymousClass000.A00(2172), false));
                                    requireArguments.getBoolean(AnonymousClass000.A00(3388), false);
                                    IOA ioa = this.A03;
                                    if (ioa == null) {
                                        str2 = "commentComposerController";
                                    } else {
                                        registerLifecycleListener(ioa);
                                        String string4 = requireArguments.getString(AnonymousClass000.A00(2174));
                                        1Xj A023 = DbX.A0d(r9).A02(string4);
                                        this.A00 = A023;
                                        if (A023 == null) {
                                            if (string4 != null) {
                                                1OC A042 = C3724090s.A04(AnonymousClass7TE.A0l(r9), string4);
                                                H50.A00(A042, this, 3);
                                                schedule(A042);
                                            } else {
                                                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                                                i = -386654207;
                                            }
                                        }
                                        AnonymousClass0fD.A09(1608546724, A022);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("insightsHost");
            throw AnonymousClass00P.createAndThrow();
        }
        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
        i = -1855886626;
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(87930790);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.comment_textview_layout, viewGroup, false);
        AnonymousClass0fD.A09(-1603884079, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1877390550);
        H1V.super.onPause();
        this.A0B = false;
        AnonymousClass0fD.A09(-170297376, A022);
    }
}
