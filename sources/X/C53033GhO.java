package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.facebook.rp.platform.metaai.rsys.voicestate.LLMResponse;
import com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4;
import java.util.ArrayDeque;
import java.util.concurrent.CancellationException;

/* renamed from: X.GhO  reason: case insensitive filesystem */
public final class C53033GhO extends 2YL {
    public MetaAiRsysSdkRealTimeSession A00;
    public LLMResponse A01;
    public C262204Co A02;
    public final OVH A03;
    public final C62320sa A04;
    public final C62320sa A05;
    public final AnonymousClass0r6 A06;
    public final AnonymousClass0r6 A07;
    public final 0V2 A08;
    public final 0V2 A09;
    public final 05G A0A;
    public final AnonymousClass0Ud A0B;
    public final C262094Cc A0C;

    public C53033GhO(OVH ovh, C262094Cc r16, C62320sa r17, C62320sa r18) {
        C62320sa r1 = r17;
        C62320sa r0 = r18;
        C262094Cc r2 = r16;
        C51974G9v.A1M(r2, r1, r0);
        this.A03 = ovh;
        this.A0C = r2;
        this.A04 = r1;
        this.A05 = r0;
        02z A10 = DbS.A10(new I4Z((Uri) null, HMJ.CONNECTING, (JMQ) null, (CharSequence) null, AnonymousClass05K.A01, (String) null, (String) null, false, false, false, false, true, false));
        this.A0A = A10;
        this.A0B = A10;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 0, 0);
        this.A09 = A012;
        this.A07 = A012;
        05D A013 = 10D.A01(num, 0, 0);
        this.A08 = A013;
        this.A06 = A013;
    }

    public final void A01() {
        Object value;
        HMJ hmj;
        Integer num;
        CharSequence charSequence;
        boolean z;
        boolean z2;
        boolean z3;
        Uri uri;
        boolean z4;
        this.A01 = null;
        05G r6 = this.A0A;
        do {
            value = r6.getValue();
            I4Z i4z = (I4Z) value;
            hmj = HMJ.ENDED;
            num = AnonymousClass05K.A01;
            charSequence = i4z.A03;
            z = i4z.A0A;
            z2 = i4z.A08;
            z3 = i4z.A0B;
            uri = i4z.A00;
            z4 = i4z.A09;
            C51969G9p.A1N(hmj, 3, num);
        } while (!r6.AIY(value, new I4Z(uri, hmj, (JMQ) null, charSequence, num, (String) null, (String) null, false, z, z2, false, z3, z4)));
        C262204Co r0 = this.A02;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A02 = null;
        if (this.A00 != null) {
            C58106ImS.A03(this, C67391tE.A00, 32);
        }
    }

    public final void A02(Context context, AnonymousClass07Z r41, String str, String str2, 0sP r44, long j, boolean z, boolean z2) {
        Object value;
        HMJ hmj;
        Context context2;
        String string;
        String str3;
        String str4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Uri uri;
        Integer num;
        JMQ jmq;
        boolean z7;
        Object value2;
        I4Z i4z;
        String str5;
        String str6;
        CharSequence charSequence;
        HMJ hmj2;
        boolean z8;
        boolean z9;
        boolean z10;
        Uri uri2;
        Integer num2;
        AnonymousClass07Z r37 = r41;
        String str7 = str;
        0sP r15 = r44;
        C51974G9v.A1M(r37, str7, r15);
        C262204Co r0 = this.A02;
        if (r0 == null || !r0.isActive()) {
            05G r10 = this.A0A;
            do {
                value = r10.getValue();
                I4Z i4z2 = (I4Z) value;
                hmj = HMJ.CONNECTING;
                context2 = context;
                string = context2.getString(2131966422);
                str3 = i4z2.A05;
                str4 = i4z2.A06;
                z3 = i4z2.A0C;
                z4 = i4z2.A0A;
                z5 = i4z2.A08;
                z6 = i4z2.A0B;
                uri = i4z2.A00;
                num = i4z2.A04;
                jmq = i4z2.A02;
                z7 = i4z2.A09;
                0qQ.A0B(hmj, 3);
            } while (!r10.AIY(value, new I4Z(uri, hmj, jmq, string, num, str3, str4, z3, z4, z5, false, z6, z7)));
            boolean z11 = z2;
            if (!z2) {
                do {
                    value2 = r10.getValue();
                    i4z = (I4Z) value2;
                    str5 = i4z.A05;
                    str6 = i4z.A06;
                    charSequence = i4z.A03;
                    hmj2 = i4z.A01;
                    z8 = i4z.A0C;
                    z9 = i4z.A07;
                    z10 = i4z.A0B;
                    uri2 = i4z.A00;
                    num2 = i4z.A04;
                } while (!r10.AIY(value2, new I4Z(uri2, hmj2, i4z.A02, charSequence, num2, str5, str6, z8, false, false, z9, z10, i4z.A09)));
            }
            this.A02 = 1Eo.A04(this.A0C, new MetaAiVoiceSessionViewModel$startVoiceSession$4(context2, r37, this, str2, str7, (AnonymousClass4D7) null, r15, j, z, z11), C318116oQ.A00(this));
            return;
        }
        C71004OWb.A00.A00("MetaAiVoiceSessionViewModel", "Voice session is already active");
    }

    public final void A03(Context context, AnonymousClass07Z r29, 0sP r30, long j) {
        Object value;
        I4Z i4z;
        SpannableString A002;
        HMJ hmj;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        String str2;
        05G r9 = this.A0A;
        do {
            value = r9.getValue();
            i4z = (I4Z) value;
            A002 = A00(context, r29, this, r30, j, false);
            String str3 = i4z.A05;
            String str4 = i4z.A06;
            hmj = i4z.A01;
            boolean z6 = i4z.A0C;
            boolean z7 = i4z.A0A;
            boolean z8 = i4z.A08;
            boolean z9 = i4z.A07;
            boolean z10 = i4z.A0B;
            z = z10;
            z2 = z9;
            z3 = z8;
            z4 = z7;
            z5 = z6;
            str = str4;
            str2 = str3;
        } while (!r9.AIY(value, new I4Z(i4z.A00, hmj, i4z.A02, A002, i4z.A04, str2, str, z5, z4, z3, z2, z, i4z.A09)));
    }

    public static final SpannableString A00(Context context, AnonymousClass07Z r7, C53033GhO ghO, 0sP r9, long j, boolean z) {
        context.getResources();
        SpannableStringBuilder A0E = C51965G9l.A0E();
        ArrayDeque arrayDeque = new ArrayDeque();
        A0E.append(context.getString(2131956554));
        A0E.append(" ");
        arrayDeque.addFirst(new C55699Hlw(A0E.length(), 33, new C52831GdN(context, r7, ghO, r9, j, z)));
        A0E.append(context.getString(2131956553));
        17k.A0F(DbT.A1b(arrayDeque));
        C55699Hlw hlw = (C55699Hlw) arrayDeque.removeFirst();
        A0E.setSpan(hlw.A02, hlw.A01, A0E.length(), hlw.A00);
        return new SpannableString(A0E);
    }

    public final void onCleared() {
        A01();
    }
}
