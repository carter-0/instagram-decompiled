package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.graphql.IGDDetectAndTranslateTextMessageQueryResponseImpl;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LqK  reason: case insensitive filesystem */
public final class C65265LqK implements C41836B2r {
    public final C333517Zg A00;
    public final C62036KWs A01;
    public final 1Av A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C66257MKs.A00);
    public final C62320sa A04;
    public final UserSession A05;

    public final boolean AP3() {
        return false;
    }

    public final SpannableString BV6(Context context, C332907Wx r6, MessageIdentifier messageIdentifier, Integer num, int i) {
        int i2;
        String string;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                i2 = 2131959737;
            } else if (intValue != 2) {
                string = "";
            } else {
                i2 = 2131959808;
            }
            string = context.getString(i2);
        } else {
            i2 = 2131959734;
            string = context.getString(i2);
        }
        0qQ.A0A(string);
        SpannableStringBuilder A0C = DbS.A0C(string);
        if (num != AnonymousClass05K.A0C) {
            AnonymousClass7AV.A05(A0C, new ELP(this, messageIdentifier, num, i), string);
        }
        SpannableString valueOf = SpannableString.valueOf(A0C);
        0qQ.A07(valueOf);
        return valueOf;
    }

    public final void Ds0(MessageIdentifier messageIdentifier, Integer num) {
        if (!DbT.A1a(this.A02.A01, C273654mx.A00(658))) {
            Context context = (Context) this.A04.invoke();
            if (context != null) {
                C58195Inz inz = new C58195Inz(5, messageIdentifier, this, num);
                F3t f3t = new F3t(context);
                f3t.A06 = AnonymousClass7TE.A16(context, 2131959802);
                f3t.A04 = AnonymousClass7TE.A16(context, 2131959801);
                f3t.A05 = AnonymousClass05K.A01;
                Drawable drawable = context.getDrawable(R.drawable.ig_illustrations_illo_translate_refresh);
                if (drawable != null) {
                    f3t.A03(drawable);
                    f3t.A09 = true;
                    f3t.A02(LV2.A00(inz, 9), f3t.A0E.getString(2131968772));
                    f3t.A07 = AnonymousClass7TE.A16(context, 2131954722);
                    f3t.A00 = null;
                    f3t.A01();
                    return;
                }
                throw DbU.A0h();
            }
            return;
        }
        A00(this, messageIdentifier, num);
    }

    public final void FHw(AnonymousClass7SD r1, List list, boolean z, boolean z2) {
    }

    public final void onDestroy() {
    }

    public static final void A00(C65265LqK lqK, MessageIdentifier messageIdentifier, Integer num) {
        String str = messageIdentifier.A01;
        C65265LqK lqK2 = lqK;
        AnonymousClass7ZY BSN = lqK2.A00.BSN();
        AnonymousClass7LQ BSO = BSN.BSO(str);
        if (BSO != null) {
            Integer num2 = AnonymousClass05K.A00;
            Integer num3 = num;
            if (num3 == num2 || AnonymousClass79U.A02(BSO)) {
                BSN.EdR(num3, str, false);
                BSO.A0b = true;
                return;
            }
            C254703su r4 = BSO.A0e;
            0qQ.A07(r4);
            String A002 = AnonymousClass1Q2.A00();
            WeakReference A0v = C51965G9l.A0v(lqK2.A04.invoke());
            C62036KWs kWs = lqK2.A01;
            List<C254703su> A1I = AnonymousClass7TE.A1I(r4);
            L99 l99 = new L99(lqK2, BSO, r4, A002, A0v);
            ArrayList A0p = AnonymousClass7TF.A0p(A1I);
            for (C254703su r6 : A1I) {
                2IV r5 = new 2IV();
                r5.A09(r6.A1q, "content");
                r5.A09(r6.A0g(), "item_id");
                A0p.add(r5);
            }
            2IV r62 = new 2IV();
            r62.A05("bulk_messages", A0p);
            r62.A09(AnonymousClass1Q2.A00(), "target_dialect_code");
            2IS A042 = C41845B3m.A04();
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(JTP.A0L(r62, A042, "input"), "IGDDetectAndTranslateTextMessageQuery", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), IGDDetectAndTranslateTextMessageQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_igd_detect_and_translate_text_message_query", AnonymousClass7TE.A1C());
            1vn A012 = 1vm.A01(kWs.A00);
            C65265LqK lqK3 = l99.A00;
            JTO.A0E(lqK3.A03).post(new C66036M8v(lqK3, l99.A01, l99.A02));
            JTO.A1Y(num2, new MHI(A012, l99, pandoGraphQLRequest, (AnonymousClass4D7) null, 10), kWs.A01);
        }
    }

    public C65265LqK(UserSession userSession, C333517Zg r3, C62036KWs kWs, C62320sa r5) {
        this.A04 = r5;
        this.A05 = userSession;
        this.A01 = kWs;
        this.A00 = r3;
        this.A02 = 1Au.A00(userSession);
    }
}
