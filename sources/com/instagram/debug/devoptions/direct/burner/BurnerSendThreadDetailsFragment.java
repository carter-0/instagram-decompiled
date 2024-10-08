package com.instagram.debug.devoptions.direct.burner;

import X.0qQ;
import X.2da;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C227642jf;
import X.C254763t0;
import X.C47518E6c;
import X.C66580MXl;
import X.C66583MXo;
import X.C67293MlS;
import X.C71277OhI;
import X.DbS;
import X.DbU;
import X.DbW;
import X.FGF;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BurnerSendThreadDetailsFragment extends C47518E6c implements AnonymousClass4DS {
    public static final int $stable = 8;
    public static final String ARGUMENT_DIRECT_THREAD_KEY = "direct_thread_key";
    public static final Companion Companion = new Object();
    public static final String MODULE_NAME = "burner_send_settings_fragment";
    public C254763t0 directThreadId;
    public final String moduleName = "burner_send_settings_fragment";
    public BurnerSendSettingsConfig sendSettingsConfig;
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r3 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C50989Fmc createMultiChoiceMenuItem(java.lang.CharSequence r13, java.lang.String[] r14, java.lang.Object[] r15, int r16, java.lang.Object r17, X.0sP r18) {
        /*
            r12 = this;
            r8 = r15
            int r2 = r15.length
            r1 = 0
        L_0x0003:
            r4 = 0
            r6 = r14
            r7 = r18
            if (r1 >= r2) goto L_0x0017
            r0 = r15[r1]
            r3 = r17
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x004e
            r3 = r14[r1]
            if (r3 != 0) goto L_0x001e
        L_0x0017:
            r0 = r15[r16]
            r3 = r14[r16]
            r7.invoke(r0)
        L_0x001e:
            r5 = r12
            android.content.Context r2 = r12.requireContext()
            r10 = r13
            java.lang.StringBuilder r1 = X.JTQ.A0d(r13)
            java.lang.String r0 = " : "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r3, r1)
            X.Fmc r9 = new X.Fmc
            r9.<init>((android.content.Context) r2, (android.view.View.OnClickListener) r4, (java.lang.CharSequence) r0)
            X.3Ar r0 = r12.getScrollingViewProxy()
            X.2rL r11 = r0.AZK()
            boolean r0 = r11 instanceof X.C68504NKx
            if (r0 == 0) goto L_0x004c
            X.NKx r11 = (X.C68504NKx) r11
        L_0x0044:
            com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment$createMultiChoiceMenuItem$onClickListener$1 r4 = new com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment$createMultiChoiceMenuItem$onClickListener$1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r9.A05 = r4
            return r9
        L_0x004c:
            r11 = r4
            goto L_0x0044
        L_0x004e:
            int r1 = r1 + 1
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment.createMultiChoiceMenuItem(java.lang.CharSequence, java.lang.String[], java.lang.Object[], int, java.lang.Object, X.0sP):X.Fmc");
    }

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "Burner Bulk Send");
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        ArrayList A1C = AnonymousClass7TE.A1C();
        FGF.A01(A1C, 2131975292);
        C66583MXo.A1J(getString(2131975291), A1C);
        String format = new SimpleDateFormat("MMM d, hh:mm:ss", Locale.US).format(new Date());
        String A0m = DbU.A0m(this, 2131975291);
        0qQ.A0A(format);
        A1C.add(new C71277OhI(BurnerSendThreadDetailsFragment$onViewCreated$bulkIdEditText$2.INSTANCE, new BurnerSendThreadDetailsFragment$onViewCreated$bulkIdEditText$1(this), 1, A0m, format, false));
        C66583MXo.A1J(getString(2131957857), A1C);
        A1C.add(new C71277OhI(BurnerSendThreadDetailsFragment$onViewCreated$messageCountEditText$2.INSTANCE, new BurnerSendThreadDetailsFragment$onViewCreated$messageCountEditText$1(this), C66580MXl.A0q(), DbU.A0m(this, 2131957857), "10", false));
        String A0m2 = DbU.A0m(this, 2131957858);
        ArrayList A0v = DbS.A0v(r4);
        for (BurnerSendSettingsConfig.MessageType name : BurnerSendSettingsConfig.MessageType.values()) {
            A0v.add(name.name());
        }
        A1C.add(new C67293MlS(C66583MXo.A07(this, createMultiChoiceMenuItem(A0m2, (String[]) A0v.toArray(new String[0]), BurnerSendSettingsConfig.MessageType.values(), 1, BurnerSendSettingsConfig.MessageType.TEXT, new BurnerSendThreadDetailsFragment$onViewCreated$2(this)), A1C), (View.OnClickListener) new BurnerSendThreadDetailsFragment$onViewCreated$3(this), "Send"));
        setItems(A1C);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1526098623);
        super.onCreate(bundle);
        String string = requireArguments().getString(ARGUMENT_DIRECT_THREAD_KEY);
        if (string != null) {
            this.directThreadId = C66580MXl.A0g(string);
        }
        this.sendSettingsConfig = new BurnerSendSettingsConfig("", 1, true, BurnerSendSettingsConfig.MessageType.TEXT, (String) null);
        AnonymousClass0fD.A09(-1912438509, A02);
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
