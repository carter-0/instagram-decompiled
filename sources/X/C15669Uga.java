package X;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Uga  reason: case insensitive filesystem */
public final class C15669Uga extends C14097Tpp {
    public boolean A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        UserSession userSession;
        boolean z;
        int i;
        0qQ.A0B(context, 0);
        SearchEditText searchEditText = new SearchEditText(context, (AttributeSet) null, 0);
        UserSession A0A = C308206Td.A0A(this.A01);
        if (A0A instanceof UserSession) {
            userSession = A0A;
        } else {
            userSession = null;
        }
        int A012 = C66582MXn.A01(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_v2_1_winner_submission_height);
        searchEditText.setMinimumHeight(A012);
        searchEditText.setMinimumWidth(dimensionPixelSize);
        if (userSession != null) {
            z = 182.A06(0Tu.A05, userSession, 36328044570688394L);
        } else {
            z = false;
        }
        searchEditText.A0P = true;
        SearchEditText.A02(searchEditText, true, z);
        SearchEditText.A01(searchEditText);
        searchEditText.setSingleLine();
        searchEditText.A08(true);
        DbU.A11(context, searchEditText, R.drawable.elevated_rounded_meta_ai_searchbar_background);
        searchEditText.setImeOptions(3);
        if (userSession != null) {
            i = C14426Tvv.A00(userSession);
        } else {
            i = 2131972797;
        }
        searchEditText.setHint(i);
        searchEditText.setHintTextColor(context.getColor(R.color.ig_search_meta_ai_searchbar_hint_color));
        return searchEditText;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15669Uga(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
        this.A02 = r2;
        this.A01 = r1;
    }

    public static final void A00(C15669Uga uga, String str) {
        C307786Rm r3;
        Context context;
        String A0R;
        if (00l.A0W(str)) {
            r3 = uga.A01;
            context = r3.A00;
            A0R = AnonymousClass000.A00(3356);
        } else {
            String encode = Uri.encode(str);
            r3 = uga.A01;
            context = r3.A00;
            A0R = 002.A0R("instagram://direct_meta_ai_thread?prompt=", encode);
        }
        FH7.A03(context, A0R);
        C276544tV r2 = uga.A02;
        C277014uI A09 = r2.A09();
        if (A09 != null) {
            C307886Rw.A03(r3, r2, Pxj.A0a(r2), A09);
        }
    }
}
