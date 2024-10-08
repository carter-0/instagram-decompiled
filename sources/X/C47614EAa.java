package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.RangeIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.text.BreakIterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.EAa  reason: case insensitive filesystem */
public final class C47614EAa extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final E6Y A03;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String A0F;
        int A032 = AnonymousClass0fD.A03(836332278);
        Context context = this.A00;
        AnonymousClass0iw r3 = this.A01;
        C49567Eyc eyc = (C49567Eyc) DbT.A0o(view);
        C49568Eyd eyd = (C49568Eyd) obj;
        E6Y e6y = this.A03;
        CircularImageView circularImageView = eyc.A02;
        if (circularImageView != null) {
            circularImageView.setUrl(eyd.A01, r3);
        }
        TextView textView = eyc.A01;
        if (textView != null) {
            if (TextUtils.isEmpty(eyd.A02)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(eyd.A02);
            }
        }
        TextView textView2 = eyc.A00;
        if (textView2 != null) {
            TextWithEntities textWithEntities = eyd.A00;
            if (textWithEntities == null || TextUtils.isEmpty(textWithEntities.A02)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                TextWithEntities textWithEntities2 = eyd.A00;
                int A0F2 = 2Yu.A0F(context, R.attr.igds_color_link);
                C49428EvU evU = new C49428EvU(e6y);
                SpannableString spannableString = new SpannableString(textWithEntities2.A02);
                0sn<RangeIntf> r0 = textWithEntities2.A05;
                if (r0 == null) {
                    r0 = 0sn.A00;
                }
                for (RangeIntf rangeIntf : r0) {
                    0qQ.A0B(rangeIntf, 0);
                    int A0A = AnonymousClass7TG.A0A(rangeIntf.BXp());
                    int A0A2 = AnonymousClass7TG.A0A(rangeIntf.BXp()) + AnonymousClass7TG.A0A(rangeIntf.BMP());
                    if (!(rangeIntf.B1q() == null || rangeIntf.B1q().getUrl() == null)) {
                        spannableString.setSpan(new C46690DjJ(A0F2, 0, evU, rangeIntf), A0A, A0A2, 17);
                    }
                }
                SpannableStringBuilder A0C = DbS.A0C(spannableString);
                Long l = eyd.A00.A01;
                if (l != null) {
                    long longValue = l.longValue();
                    0qQ.A0B(context, 0);
                    long A0I = AnonymousClass7TG.A0I();
                    if (TimeUnit.SECONDS.toDays(A0I - longValue) < 28) {
                        A0F = 1G0.A09(AnonymousClass7TF.A0A(context), (double) longValue);
                    } else {
                        A0F = 1G0.A0F("MMMM d", (double) longValue, (double) A0I);
                    }
                    if (A0F != null) {
                        A0C.append("\n").append(A0F);
                        String obj3 = A0C.toString();
                        0qQ.A0B(obj3, 0);
                        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                        characterInstance.setText(obj3);
                        int last = characterInstance.last();
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(DbV.A01(context));
                        String A0R = 002.A0R("\n", A0F);
                        0qQ.A0B(A0R, 0);
                        BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                        characterInstance2.setText(A0R);
                        A0C.setSpan(foregroundColorSpan, last - characterInstance2.last(), last, 33);
                    }
                }
                DbX.A1G(textView2, A0C);
            }
        }
        AnonymousClass0fD.A0A(-565719482, A032);
    }

    public C47614EAa(Context context, AnonymousClass0iw r2, UserSession userSession, E6Y e6y) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = e6y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-1343353934);
        View A08 = DbU.A08(LayoutInflater.from(this.A00), R.layout.support_inbox_event_row);
        A08.setTag(new C49567Eyc(A08));
        AnonymousClass0fD.A0A(-1100598393, A032);
        return A08;
    }
}
