package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.79R  reason: invalid class name */
public final class AnonymousClass79R extends C232222tE {
    public final UserSession A00;
    public final AnonymousClass7YP A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.layout_quiet_mode_nudge, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        return new C67946MxW(inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C39985AMr aMr;
        0xY r4;
        long j;
        String str;
        String str2;
        StringBuilder sb;
        C47770EGh eGh = (C47770EGh) r8;
        C67946MxW mxW = (C67946MxW) r9;
        0qQ.A0B(eGh, 0);
        0qQ.A0B(mxW, 1);
        String str3 = eGh.A03;
        if (str3 == null || str3.length() == 0) {
            mxW.A01.setVisibility(8);
        } else {
            IgTextView igTextView = mxW.A01;
            igTextView.setText(str3);
            igTextView.setVisibility(0);
        }
        IgTextView igTextView2 = mxW.A00;
        igTextView2.setText(eGh.A01);
        Integer num = eGh.A02;
        if (num == AnonymousClass05K.A00) {
            aMr = new C39985AMr(this);
        } else {
            aMr = null;
        }
        AnonymousClass0fU.A00(aMr, igTextView2);
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        int intValue = num.intValue();
        if (intValue == 1 || intValue == 0) {
            AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
            j = System.currentTimeMillis();
            r4 = A002.A00.AR4();
            str = "preference_quiet_mode_nudge_last_seen_timestamp";
        } else {
            if (intValue == 4) {
                AnonymousClass4kA A003 = AnonymousClass4k9.A00(userSession);
                str2 = C395179zL.A00(num);
                j = System.currentTimeMillis();
                r4 = A003.A00.AR4();
                sb = new StringBuilder();
                sb.append("preference_quiet_mode_nudge_last_seen_timestamp_");
            } else if (intValue == 2 || intValue == 3) {
                C254793t3 r0 = eGh.A00.A0P;
                if (r0 != null) {
                    AnonymousClass4kA A004 = AnonymousClass4k9.A00(userSession);
                    String A005 = C395179zL.A00(num);
                    str2 = C300965yF.A01(r0).A00;
                    j = System.currentTimeMillis();
                    0qQ.A0B(str2, 1);
                    r4 = A004.A00.AR4();
                    sb = new StringBuilder();
                    sb.append("preference_quiet_mode_nudge_last_seen_timestamp_");
                    sb.append(A005);
                    sb.append('_');
                } else {
                    return;
                }
            } else {
                throw new RuntimeException();
            }
            sb.append(str2);
            str = sb.toString();
        }
        r4.E5c(str, j);
        r4.apply();
    }

    public final Class modelClass() {
        return C47770EGh.class;
    }

    public AnonymousClass79R(UserSession userSession, AnonymousClass7YP r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
