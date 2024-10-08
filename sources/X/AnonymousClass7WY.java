package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.7WY  reason: invalid class name */
public final class AnonymousClass7WY implements TextView.OnEditorActionListener {
    public 1wn A00;
    public C330637Np A01;
    public C254793t3 A02;
    public Float A03;
    public Integer A04;
    public boolean A05;
    public final AnonymousClass4DH A06;
    public final AnonymousClass0iw A07;
    public final 1Ng A08;
    public final UserSession A09;
    public final C62320sa A0A;
    public final 1a8 A0B;
    public final AnonymousClass4kA A0C;

    public AnonymousClass7WY(AnonymousClass4DH r2, AnonymousClass0iw r3, 1a8 r4, UserSession userSession, C62320sa r6) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 3);
        0qQ.A0B(r4, 4);
        0qQ.A0B(r6, 5);
        this.A06 = r2;
        this.A09 = userSession;
        this.A07 = r3;
        this.A0B = r4;
        this.A0A = r6;
        this.A08 = AnonymousClass1Nd.A00(userSession);
        this.A0C = AnonymousClass4k9.A00(userSession);
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (6 != i) {
            return false;
        }
        C330637Np r0 = this.A01;
        if (r0 != null) {
            EditText editText = r0.A01;
            if (editText != null) {
                String obj = editText.getText().toString();
                C62320sa r02 = this.A0A;
                C333517Zg r8 = (C333517Zg) r02.invoke();
                AnonymousClass7S7 C6l = r8.C6l();
                C254793t3 CBU = C6l.CBU();
                if (CBU != null) {
                    AnonymousClass7S7 C6l2 = ((C333517Zg) r02.invoke()).C6l();
                    AnonymousClass4DH r6 = this.A06;
                    Context requireContext = r6.requireContext();
                    UserSession userSession = this.A09;
                    if (!C70104NxK.A00(r6.requireActivity(), requireContext, r6, userSession, C6l2)) {
                        AnonymousClass0iw r1 = this.A07;
                        C254743sy B8S = C6l.B8S();
                        0qQ.A07(B8S);
                        String C6f = C6l.C6f();
                        List<AnonymousClass17B> BRZ = C6l.BRZ();
                        0qQ.A0B(r1, 1);
                        0xI A002 = 0xI.A00(r1, "direct_thread_name_group");
                        A002.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C66647MaG.A0A(B8S));
                        A002.A09("is_e2ee", Boolean.valueOf(C66647MaG.A0E(B8S)));
                        A002.A0C("where", "top_banner");
                        A002.A0C("existing_name", C6f);
                        if (!BRZ.isEmpty()) {
                            ArrayList arrayList = new ArrayList(0Yv.A1E(BRZ, 10));
                            for (AnonymousClass17B id : BRZ) {
                                arrayList.add(id.getId());
                            }
                            A002.A0D("recipient_ids", arrayList);
                        }
                        C60510iO.A00(userSession).EFq(A002);
                        r8.C62().AGp(r6.requireContext(), CBU, obj, C6l.CUO());
                    }
                    C3265677h.A07(EZa.THREAD_VIEW_BANNER, (C48140EZi) null, this.A07, userSession, C300965yF.A07(CBU));
                    return true;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A00(AnonymousClass7WY r6) {
        C330637Np r4;
        HashSet hashSet;
        Set A002;
        String str;
        C254793t3 r5 = r6.A02;
        if (r5 != null && (r4 = r6.A01) != null) {
            boolean z = r5 instanceof MsysThreadId;
            AnonymousClass4kA r2 = r6.A0C;
            if (z) {
                A002 = AnonymousClass4kA.A00(r2, "direct_v2_secure_threads_inline_group_naming_dismissed", hashSet);
                str = String.valueOf(C300965yF.A03(r5).A00);
            } else {
                hashSet = new HashSet(0);
                A002 = AnonymousClass4kA.A00(r2, "direct_v2_threads_inline_group_naming_dismissed", hashSet);
                str = C300965yF.A01(r5).A00;
            }
            if (A002.contains(str) || !r6.A05) {
                r4.A00();
                return;
            }
            r4.A03.setVisibility(0);
            View view = r4.A00;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public final void A01(float f) {
        View view;
        Float f2;
        this.A03 = Float.valueOf(f);
        C330637Np r0 = this.A01;
        if (r0 != null && (view = r0.A00) != null && (f2 = r0.A05.A03) != null) {
            view.setAlpha(f2.floatValue());
        }
    }
}
