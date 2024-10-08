package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class FGB {
    public C47571E8j A00;
    public C322326ve A01;
    public C336247eJ A02;
    public boolean A03;
    public final Handler A04 = AnonymousClass7TF.A0D();
    public final TextWatcher A05;
    public final EditText A06;
    public final TextView A07;
    public final TextView A08;
    public final AnonymousClass4DH A09;
    public final AnonymousClass0iw A0A;
    public final 1Ng A0B;
    public final C228602lw A0C;
    public final UserSession A0D;
    public final C49505Ewk A0E = new C49505Ewk();
    public final C294425mQ A0F = C294425mQ.MENTION_AND_HASHTAG;
    public final String A0G;
    public final List A0H = AnonymousClass7TE.A1C();
    public final int A0I;
    public final ListView A0J;
    public final TextView A0K;
    public final C49379Euh A0L;
    public final XC1 A0M;
    public final C74585PxY A0N;

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FGB(android.widget.EditText r10, android.widget.ListView r11, android.widget.TextView r12, android.widget.TextView r13, android.widget.TextView r14, X.AnonymousClass4DH r15, X.AnonymousClass0iw r16, com.instagram.common.session.UserSession r17, X.C49379Euh r18, java.lang.String r19) {
        /*
            r9 = this;
            r2 = 3
            r6 = r17
            X.AnonymousClass7TF.A1E(r6, r2, r14)
            r0 = 8
            X.0qQ.A0B(r11, r0)
            r0 = 10
            r1 = r18
            X.0qQ.A0B(r1, r0)
            r9.<init>()
            r9.A09 = r15
            r5 = r16
            r9.A0A = r5
            r9.A0D = r6
            r9.A06 = r10
            r9.A08 = r12
            r9.A07 = r13
            r9.A0K = r14
            r9.A0J = r11
            r0 = r19
            r9.A0G = r0
            r9.A0L = r1
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r6)
            r9.A0B = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r9.A0H = r0
            X.5mQ r0 = X.C294425mQ.MENTION_AND_HASHTAG
            r9.A0F = r0
            android.os.Handler r0 = X.AnonymousClass7TF.A0D()
            r9.A04 = r0
            X.Ewk r0 = new X.Ewk
            r0.<init>()
            r9.A0E = r0
            androidx.fragment.app.FragmentActivity r4 = r15.requireActivity()
            X.0gy r3 = X.AnonymousClass07i.A00(r15)
            r1 = 0
            X.2lw r0 = new X.2lw
            r0.<init>(r4, r3, r1)
            r9.A0C = r0
            android.content.res.Resources r1 = X.DbV.A05(r15)
            r0 = 2131492865(0x7f0c0001, float:1.8609194E38)
            int r0 = r1.getInteger(r0)
            r9.A0I = r0
            r0 = 5
            X.KXN r8 = new X.KXN
            r8.<init>(r9, r0)
            r9.A0N = r8
            X.Fl2 r7 = new X.Fl2
            r7.<init>(r9)
            r9.A0M = r7
            r1 = 16
            X.FKk r0 = new X.FKk
            r0.<init>(r9, r1)
            r9.A05 = r0
            androidx.fragment.app.FragmentActivity r4 = r15.requireActivity()
            X.E8j r3 = new X.E8j
            r3.<init>(r4, r5, r6, r7, r8)
            r9.A00 = r3
            r11.setAdapter(r3)
            X.2lw r4 = r9.A0C
            r0 = 4
            X.Lwt r3 = new X.Lwt
            r3.<init>(r9, r0)
            r0 = 1
            X.7eJ r1 = new X.7eJ
            r1.<init>((X.AnonymousClass4D6) r4, (X.C336227eH) r3, (boolean) r0)
            r9.A02 = r1
            X.Fky r0 = new X.Fky
            r0.<init>(r9, r2)
            r1.EcJ(r0)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r1 = r9.A0D
            com.instagram.user.model.User r0 = r0.A01(r1)
            android.widget.EditText r4 = r9.A06
            java.lang.String r0 = r0.A0O()
            r4.setText(r0)
            A01(r9)
            android.text.TextWatcher r0 = r9.A05
            r4.addTextChangedListener(r0)
            r0 = 15
            X.FKk.A00(r4, r9, r0)
            boolean r0 = X.DbU.A1Z(r1)
            if (r0 == 0) goto L_0x00e9
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            android.widget.TextView r2 = r9.A08
            if (r2 == 0) goto L_0x00d9
            r1 = 45
            X.FPH r0 = new X.FPH
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r3, (java.lang.Object) r2)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x00d9:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            android.widget.TextView r2 = r9.A07
            if (r2 == 0) goto L_0x00e9
            r1 = 45
            X.FPH r0 = new X.FPH
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r3, (java.lang.Object) r2)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x00e9:
            r4.requestFocus()
            X.0nA.A0R(r4)
            android.text.Editable r0 = r10.getText()
            X.0qQ.A07(r0)
            A00(r0, r9)
            X.F3s r2 = X.C49061Eof.A00(r6)
            X.EWT r1 = X.EWT.EDIT_BIO_FLOW
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A02(r1, r0)
            X.6ve r0 = X.C322316vd.A00(r6)
            r9.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGB.<init>(android.widget.EditText, android.widget.ListView, android.widget.TextView, android.widget.TextView, android.widget.TextView, X.4DH, X.0iw, com.instagram.common.session.UserSession, X.Euh, java.lang.String):void");
    }

    public static final void A01(FGB fgb) {
        List list = fgb.A0H;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fgb.A06.getText().removeSpan(it.next());
            it.remove();
        }
        EditText editText = fgb.A06;
        String A0f = AnonymousClass7TF.A0f(editText);
        int A0F2 = 2Yu.A0F(fgb.A09.requireContext(), R.attr.igds_color_link);
        Iterator it2 = C253053q8.A05(A0f, false).iterator();
        while (it2.hasNext()) {
            C255723uc r0 = (C255723uc) it2.next();
            Editable text = editText.getText();
            0qQ.A07(text);
            C380209Xb r3 = new C380209Xb(A0F2);
            list.add(r3);
            text.setSpan(r3, r0.A01, r0.A00, 33);
        }
        Iterator it3 = C253053q8.A03(A0f).iterator();
        while (it3.hasNext()) {
            C255723uc r02 = (C255723uc) it3.next();
            Editable text2 = editText.getText();
            0qQ.A07(text2);
            C380209Xb r32 = new C380209Xb(A0F2);
            list.add(r32);
            text2.setSpan(r32, r02.A01, r02.A00, 33);
        }
    }

    public static final void A02(FGB fgb, User user) {
        AnonymousClass4DH r0 = fgb.A09;
        Context requireContext = r0.requireContext();
        UserSession userSession = fgb.A0D;
        FragmentActivity activity = r0.getActivity();
        String A002 = C273654mx.A00(894);
        FGc.A04(requireContext, userSession, user, new C336177eC(activity, userSession, A002), A002, (C62320sa) null, (C62320sa) null);
    }

    public static final void A03(FGB fgb, String str, List list, boolean z) {
        C66967Mg0 mg0;
        Object nfj;
        C231642s0 r0;
        C47571E8j e8j = fgb.A00;
        if (e8j == null) {
            0qQ.A0F("suggestionsAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0B(list, 0);
        List<C48232EbD> list2 = e8j.A06;
        list2.clear();
        list2.addAll(list);
        e8j.A01 = z;
        e8j.A00 = str;
        e8j.A06();
        int i = 0;
        for (C48232EbD ebD : list2) {
            User user = ebD.A01;
            Hashtag hashtag = ebD.A00;
            if (user != null) {
                C66966Mfz mfz = new C66966Mfz();
                mfz.A01 = i;
                mfz.A00 = i;
                mg0 = new C66967Mg0(mfz);
                nfj = new C66632Ma1(user);
                r0 = e8j.A03;
            } else if (hashtag != null) {
                C66966Mfz mfz2 = new C66966Mfz();
                mfz2.A01 = i;
                mfz2.A00 = i;
                mg0 = new C66967Mg0(mfz2);
                nfj = new C69160Nfj(hashtag);
                r0 = e8j.A02;
            }
            e8j.A09(r0, nfj, mg0);
            i++;
        }
        if (e8j.A01) {
            e8j.A09(e8j.A05, e8j.A04, (Object) null);
        }
        e8j.A07();
    }

    public static final void A00(Editable editable, FGB fgb) {
        int codePointCount;
        String obj = editable.toString();
        if (182.A06(0Tu.A05, fgb.A0D, 36326640116053908L)) {
            codePointCount = obj.length();
        } else {
            codePointCount = obj.codePointCount(0, obj.length());
        }
        int i = fgb.A0I - codePointCount;
        boolean z = false;
        if (i < 0) {
            z = true;
        }
        TextView textView = fgb.A0K;
        AnonymousClass4DH r3 = fgb.A09;
        FragmentActivity requireActivity = r3.requireActivity();
        Context requireContext = r3.requireContext();
        int i2 = R.attr.igds_color_primary_text;
        if (z) {
            i2 = R.attr.igds_color_error_or_destructive;
        }
        DbT.A17(requireActivity, textView, 2Yu.A0H(requireContext, i2));
        textView.setText(NumberFormat.getInstance(Locale.getDefault()).format((long) i));
        Resources A052 = DbV.A05(r3);
        int i3 = R.plurals.n_characters_remaining;
        if (z) {
            i3 = R.plurals.n_characters_over_the_limit;
            i = -i;
        }
        textView.setContentDescription(DbY.A0d(A052, i, i3));
        ActionButton actionButton = fgb.A0L.A00.A08;
        if (actionButton != null) {
            actionButton.setEnabled(!z);
        }
    }
}
