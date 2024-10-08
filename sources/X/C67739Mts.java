package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.Mts  reason: case insensitive filesystem */
public final class C67739Mts extends 2YL {
    public int A00;
    public OBU A01;
    public List A02;
    public final 2Fk A03;
    public final C69365Nk5 A04;
    public final List A05 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A06;
    public final 05G A07;
    public final 05G A08;
    public final AnonymousClass0Ud A09;
    public final boolean A0A;

    public C67739Mts(Context context, UserSession userSession, C69365Nk5 nk5, boolean z) {
        String str;
        0qQ.A0B(userSession, 2);
        this.A04 = nk5;
        this.A0A = z;
        this.A06 = AnonymousClass0eN.A01(new C67570Mq4(userSession, 25));
        02z A10 = DbS.A10("");
        this.A08 = A10;
        19B r4 = 19B.A00;
        this.A03 = C226292g8.A00(r4, A10);
        List list = 0sn.A00;
        02z A012 = 106.A01(list);
        this.A07 = A012;
        this.A09 = 10b.A03(A012);
        int ordinal = this.A04.ordinal();
        if (ordinal == 2) {
            1Eo.A05(r4, new C66171MGi(this, userSession, (AnonymousClass4D7) null, 46), C318116oQ.A00(this));
            str = 182.A04(0Tu.A06, userSession, 36887262197252859L);
        } else if (ordinal == 0) {
            String[] stringArray = context.getResources().getStringArray(R.array.fallback_prompts_suggestions_for_add_yours);
            0qQ.A07(stringArray);
            list = 03t.A0J(stringArray);
            this.A02 = list;
        } else if (ordinal == 1) {
            try {
                str = 182.A04(0Tu.A06, userSession, 36879462538346764L);
            } catch (JSONException e) {
                0wb.A01.Ew0("prompt_suggestions_view_model", 002.A0R("Error when parsing the suggestions JSON ", e.getLocalizedMessage()));
            }
        } else if (ordinal == 3) {
            str = 182.A04(0Tu.A06, userSession, 36879462538346764L);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        JSONArray jSONArray = new JSONArray(str);
        ArrayList A1C = AnonymousClass7TE.A1C();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            0qQ.A07(string);
            A1C.add(string);
        }
        list = 00k.A0a(A1C);
        this.A02 = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r24 == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (X.AnonymousClass7TE.A1b(r14.A05) != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36316512584995262L) == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r15, com.instagram.common.session.UserSession r16, com.instagram.common.ui.base.IgSimpleImageView r17, X.O6F r18, X.C69365Nk5 r19, java.lang.String r20, java.lang.String r21, int r22, int r23, boolean r24) {
        /*
            r14 = this;
            r4 = r17
            r9 = r19
            r6 = r16
            X.AnonymousClass7TG.A1U(r6, r9, r4)
            r8 = r14
            java.util.List r0 = r14.A02
            boolean r0 = r0.isEmpty()
            r5 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x001e
            java.util.List r0 = r14.A05
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            r3 = 0
            if (r0 == 0) goto L_0x001f
        L_0x001e:
            r3 = 1
        L_0x001f:
            X.Nk5 r0 = X.C69365Nk5.QUESTIONS
            if (r9 != r0) goto L_0x0031
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316512584995262(0x8105ad001c11be, double:3.0300470213850016E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            r2 = 1
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            X.Nk5 r0 = X.C69365Nk5.ADD_YOURS
            if (r9 != r0) goto L_0x0039
            r1 = 1
            if (r24 != 0) goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            X.Nk5 r0 = X.C69365Nk5.CHALLENGES
            if (r9 == r0) goto L_0x003f
            r5 = 0
        L_0x003f:
            if (r3 == 0) goto L_0x0091
            if (r2 != 0) goto L_0x0047
            if (r1 != 0) goto L_0x0047
            if (r5 == 0) goto L_0x0091
        L_0x0047:
            int r0 = X.2Yu.A0B(r15)
            int r1 = r15.getColor(r0)
            r0 = 2131886088(0x7f120008, float:1.9406745E38)
            X.61R r6 = X.C303756Aq.A00(r15, r0)
            if (r6 == 0) goto L_0x0091
            int r5 = android.graphics.Color.red(r1)
            int r3 = android.graphics.Color.green(r1)
            int r2 = android.graphics.Color.blue(r1)
            int r0 = android.graphics.Color.alpha(r1)
            X.2dn r1 = new X.2dn
            r1.<init>(r5, r3, r2, r0)
            X.2dv r0 = r6.A01
            X.C305716Jg.A00(r1, r0)
            r0 = 0
            r6.EL2(r0)
            r4.setImageDrawable(r6)
            r0 = 2131970883(0x7f134b43, float:1.957873E38)
            X.DbU.A12(r15, r4, r0)
            X.OjY r5 = new X.OjY
            r7 = r18
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.AnonymousClass0fU.A00(r5, r4)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67739Mts.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.common.ui.base.IgSimpleImageView, X.O6F, X.Nk5, java.lang.String, java.lang.String, int, int, boolean):void");
    }
}
