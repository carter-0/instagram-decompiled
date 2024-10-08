package X;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.73q  reason: invalid class name and case insensitive filesystem */
public final class C3256673q extends C232222tE {
    public final UserSession A00;
    public final C332957Xc A01;
    public final AnonymousClass9HC A02;
    public final Class A03;

    public static final C3256873s A00(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.thread_message_action_log, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C3256873s(inflate);
    }

    /* renamed from: A01 */
    public final void bind(C3256873s r13, C3259674w r14) {
        String str;
        0qQ.A0B(r14, 0);
        0qQ.A0B(r13, 1);
        TextView textView = r13.A00;
        SpannableString A022 = r14.A02();
        C255733ud[] r10 = (C255733ud[]) A022.getSpans(0, A022.length(), C255733ud.class);
        if (r10 != null) {
            int length = r10.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                C255733ud r6 = r10[i];
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    List A05 = r14.A05();
                    if (i2 < A05.size() && (str = (String) A05.get(i2)) != null) {
                        r6.A00 = new PGG(this, r14, str);
                    }
                }
                i++;
                i2 = i3;
            }
        }
        textView.setText(A022);
        textView.setTextColor(r14.A00());
        textView.setTypeface(textView.getTypeface(), 0);
        textView.setBackground(r14.A01());
        List A052 = r14.A05();
        C71418OkJ okJ = null;
        if (!(A052 instanceof Collection) || !A052.isEmpty()) {
            Iterator it = A052.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str2 != null && 00l.A0d(str2, "instagram://collection", false)) {
                    if (!r14.A08()) {
                        okJ = new C71418OkJ(this, r13, r14);
                    }
                }
            }
        }
        textView.setOnLongClickListener(okJ);
        if (A022.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            C3256573p.A00(textView, r14.A07());
            boolean A06 = r14.A06();
            textView.setText(A022);
            if (A06) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setHighlightColor(0);
            }
        }
        AnonymousClass1Nd.A00(this.A00).A00(new AY3(r14.A04()));
    }

    public final Class modelClass() {
        return this.A03;
    }

    public C3256673q(UserSession userSession, C332957Xc r2, AnonymousClass9HC r3, Class cls) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = userSession;
        this.A03 = cls;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return A00(layoutInflater, viewGroup);
    }
}
