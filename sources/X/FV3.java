package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

public final class FV3 implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "PinnedMessageBannerController";
    public int A00;
    public OHR A01;
    public C252063oV A02;
    public final Context A03;
    public final UserSession A04;
    public final C333517Zg A05;
    public final List A06 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C73902Pld(this, 22));
    public final View A08;

    /* JADX WARNING: type inference failed for: r9v0, types: [X.0rm, java.lang.Object] */
    public final void A01(List list, String str) {
        String str2;
        int i;
        String str3 = str;
        0qQ.A0B(str3, 1);
        Context context = this.A03;
        View view = this.A08;
        List list2 = list;
        if (!list2.isEmpty()) {
            UserSession userSession = this.A04;
            if (182.A06(0Tu.A05, userSession, 36329698132771074L)) {
                AnonymousClass0eM r1 = this.A07;
                AnonymousClass3U9 C60 = ((2Dm) r1.getValue()).C60(str3);
                if (C60 != null) {
                    ? obj = new Object();
                    2Dm r8 = (2Dm) r1.getValue();
                    DirectThreadKey BJy = C60.BJz();
                    OHR ohr = this.A01;
                    2FW r0 = null;
                    if (ohr != null) {
                        str2 = ohr.A02;
                    } else {
                        str2 = null;
                    }
                    obj.A00 = r8.BRz(BJy, String.valueOf(str2));
                    if (this.A02 == null) {
                        this.A02 = DbU.A0Y(view, R.id.pinned_message_container_stub);
                        try {
                            this.A01 = (OHR) 00k.A0O(list2, this.A00);
                        } catch (IndexOutOfBoundsException unused) {
                            DbT.A1Q(0wj.A01, "pinnedMessageBannerController highlighted message is out of bounds.", 20134884);
                        }
                        C71866Os8 A002 = C69841Nt5.A00(userSession);
                        C254703su r12 = (C254703su) obj.A00;
                        if (r12 != null) {
                            r0 = r12.A10;
                        }
                        String valueOf = String.valueOf(r0);
                        0qQ.A0B(valueOf, 1);
                        0Aj A0e = AnonymousClass7TE.A0e(A002.A00, "direct_pinned_messages_banner_impression");
                        A0e.AAJ("open_thread_id", str3);
                        A0e.AAJ("media_type", valueOf);
                        A0e.A9F(C273654mx.A00(360), Long.valueOf((long) this.A00));
                        A0e.Cgf();
                    }
                    C252063oV r02 = this.A02;
                    if (r02 != null) {
                        View view2 = r02.getView();
                        int i2 = this.A00;
                        Integer valueOf2 = Integer.valueOf(i2);
                        if (i2 < list2.size()) {
                            i = valueOf2.intValue();
                        } else {
                            i = 0;
                        }
                        this.A00 = i;
                        A00(context, view2, this, list2);
                        view2.setVisibility(0);
                        AnonymousClass0fU.A00(new FOS(obj, view2, this, C60, list2, str3, 2), view2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        C252063oV r13 = this.A02;
        if (r13 != null) {
            r13.setVisibility(8);
        }
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static final void A00(Context context, View view, FV3 fv3, List list) {
        CharSequence text;
        String str;
        try {
            fv3.A01 = (OHR) 00k.A0O(list, fv3.A00);
        } catch (IndexOutOfBoundsException unused) {
            DbT.A1Q(0wj.A01, "pinnedMessageBannerController highlighted message is out of bounds.", 20134884);
        }
        if (fv3.A01 == null) {
            C252063oV r0 = fv3.A02;
            if (r0 != null) {
                r0.setVisibility(8);
                return;
            }
            return;
        }
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.pinned_message_title);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.pinned_message_subtitle);
        OHR ohr = fv3.A01;
        if (ohr == null || (text = ohr.A06) == null) {
            text = context.getText(2131959776);
            0qQ.A07(text);
        }
        A0R.setText(text);
        OHR ohr2 = fv3.A01;
        String str2 = null;
        if (ohr2 == null || (str = ohr2.A05) == null || str.length() == 0) {
            A0R2.setVisibility(8);
        } else {
            A0R2.setText(str);
            A0R2.setVisibility(0);
        }
        OHR ohr3 = fv3.A01;
        if (ohr3 != null) {
            str2 = ohr3.A04;
        }
        View requireViewById = view.requireViewById(R.id.default_pin_icon);
        0qQ.A07(requireViewById);
        View A0G = AnonymousClass7TF.A0G(view, R.id.preview_rounded_corner_container);
        if (str2 == null || str2.length() == 0) {
            requireViewById.setVisibility(0);
            A0G.setVisibility(8);
        } else {
            DbX.A0b(view, R.id.pinned_message_preview).setUrl(C253833rU.A00(DbT.A09(str2), -1, -1), fv3);
            A0G.setVisibility(0);
            requireViewById.setVisibility(8);
        }
        LinearLayout linearLayout = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.lines_container);
        int size = list.size();
        if (size == 1 || size > 3) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        while (linearLayout.getChildCount() > size) {
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            List list2 = fv3.A06;
            0qQ.A0A(childAt);
            list2.add(childAt);
            linearLayout.removeView(childAt);
            linearLayout.setGravity(16);
        }
        while (linearLayout.getChildCount() < size) {
            List list3 = fv3.A06;
            if (!AnonymousClass7TE.A1b(list3)) {
                break;
            }
            linearLayout.addView((View) list3.remove(0));
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt2 = linearLayout.getChildAt(i);
            int i2 = fv3.A00;
            int i3 = R.attr.igds_color_stroke;
            if (i == i2) {
                i3 = R.attr.igds_color_primary_text;
            }
            childAt2.setBackgroundColor(AnonymousClass7TF.A03(context, i3));
        }
    }

    public FV3(Context context, View view, UserSession userSession, C333517Zg r6) {
        this.A03 = context;
        this.A08 = view;
        this.A05 = r6;
        this.A04 = userSession;
    }
}
