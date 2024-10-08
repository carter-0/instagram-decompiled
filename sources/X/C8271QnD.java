package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.transactions.api.UpcomingPayout;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;

/* renamed from: X.QnD  reason: case insensitive filesystem */
public final class C8271QnD extends QD7 {
    public QuickPerformanceLogger A00;
    public FBPayLoggerData A01;
    public UpcomingPayout A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final 2Fk A06;
    public final AnonymousClass2gB A07;
    public final 2FO A08;
    public final C10447RsO A09;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.Qmu] */
    /* JADX WARNING: type inference failed for: r0v70, types: [X.Rhs, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v71, types: [X.Rhs, java.lang.Object] */
    public static ImmutableList A00(C45887D9l d9l, C8271QnD qnD) {
        Object sEo;
        C8259Qmw qmw;
        String str;
        String quantityString;
        QUQ quq;
        ImmutableList immutableList = d9l.A01;
        ImmutableList.Builder A0Y = Pxe.A0Y();
        if (immutableList.isEmpty()) {
            SRV A0E = AnonymousClass2E0.A0E();
            if (A0E.A04 == null) {
                A0E.A04 = new Object();
            }
            Qmh qmh = new Qmh();
            qmh.A02 = AnonymousClass2E0.A0E().A08.getString(2131975507);
            boolean A032 = C11431STx.A03();
            Context context = AnonymousClass2E0.A0E().A08;
            int i = 2131975505;
            if (A032) {
                i = 2131975506;
            }
            AnonymousClass2E0.A0E();
            qmh.A01 = DbW.A0h(context, "Instagram", i);
            SRV A0E2 = AnonymousClass2E0.A0E();
            if (A0E2.A04 == null) {
                A0E2.A04 = new Object();
            }
            qmh.A00 = R.attr.fbpay_order_icon;
            sEo = new Qmo(qmh);
        } else {
            C8271QnD qnD2 = qnD;
            int i2 = 3;
            if (qnD2.A04) {
                Qmj qmj = new Qmj();
                qmj.A02 = 2131962190;
                if (immutableList.size() > 3) {
                    qmj.A00 = 2131962202;
                    qmj.A03 = C11496SbJ.A00(qnD2, 64);
                }
                Qms.A00(qmj, A0Y);
            } else {
                AnonymousClass2E0.A0E().A06();
            }
            if (!qnD2.A04) {
                i2 = immutableList.size();
            }
            int i3 = 6;
            if (qnD2.A05) {
                i3 = 8;
            }
            int i4 = 0;
            while (i4 < i2 && i4 < immutableList.size()) {
                C7796QXh qXh = (C7796QXh) immutableList.get(i4);
                Qml qml = new Qml(i3);
                qml.A0G = qXh.A07("receiver_name");
                qml.A04 = 1;
                qml.A03 = 2;
                qml.A0H = true;
                qml.A0F = qXh.A0C("transaction_payment_type");
                qml.A0D = qXh.getOptionalStringField(2, "creation_date");
                qml.A0E = qXh.getOptionalStringField(1, "receiver_profile_image_uri");
                if (qnD2.A05) {
                    qmw = new C8259Qmw(qXh.getRequiredCompactedStringListField(9, "transaction_item_images"));
                } else {
                    String A0A = qXh.A0A("transaction_amount_formatted");
                    String A0B = qXh.A0B("transaction_amount_subtitle");
                    ? obj = new Object();
                    obj.A01 = A0A;
                    obj.A00 = A0B;
                    qmw = obj;
                }
                qml.A0B = qmw;
                qml.A08 = C11499SbM.A00(qnD2, qXh, 50);
                if (qnD2.A05) {
                    QUQ quq2 = null;
                    if (qXh.A0F() == null) {
                        quq = null;
                    } else {
                        quq = (QUQ) qXh.A0F().A01(QUQ.class, 254825634);
                    }
                    qml.A0A = quq;
                    if (qXh.A0E() != null) {
                        quq2 = (QUQ) qXh.A0E().A01(QUQ.class, 254825634);
                    }
                    qml.A09 = quq2;
                }
                C10442RsJ rsJ = new C10442RsJ();
                rsJ.A00 = AnonymousClass05K.A01;
                if (qnD2.A05) {
                    String optionalStringField = qXh.getOptionalStringField(0, "receiver_name");
                    String str2 = "";
                    if (qXh.A0F() != null) {
                        str = C41845B3m.A0l(qXh.A0F().reinterpretRequired(0, QUQ.class, 254825634), 0);
                    } else {
                        str = str2;
                    }
                    if (qXh.A0E() != null) {
                        str2 = C41845B3m.A0l(qXh.A0E().reinterpretRequired(0, QUQ.class, 254825634), 0);
                    }
                    boolean isEmpty = qXh.getRequiredCompactedStringListField(9, "transaction_item_images").isEmpty();
                    SRV A0E3 = AnonymousClass2E0.A0E();
                    if (isEmpty) {
                        quantityString = A0E3.A08.getString(2131962191, new Object[]{optionalStringField, str, str2});
                    } else {
                        quantityString = A0E3.A08.getResources().getQuantityString(R.plurals.fbpay_hub_transaction_row_content_description_with_items, qXh.getRequiredCompactedStringListField(9, "transaction_item_images").size(), new Object[]{optionalStringField, Integer.valueOf(qXh.getRequiredCompactedStringListField(9, "transaction_item_images").size()), str, str2});
                    }
                    rsJ.A01 = quantityString;
                }
                qml.A02 = new SEE(rsJ);
                A0Y.add(new Qmq(qml));
                i4++;
            }
            if (qnD2.A03 != null && !qnD2.A04) {
                sEo = new C11188SEo(7);
            }
            return A0Y.build();
        }
        A0Y.add(sEo);
        return A0Y.build();
    }

    public C8271QnD(QuickPerformanceLogger quickPerformanceLogger, 2FO r5, C10447RsO rsO) {
        AnonymousClass2gB A0M = Pxh.A0M();
        this.A07 = A0M;
        this.A08 = r5;
        this.A00 = quickPerformanceLogger;
        this.A09 = rsO;
        this.A06 = TPM.A00(A0M, this, 18);
        C11651Sdt.A02(A0M, this.A03, this, 12);
    }

    public final void A04(Bundle bundle) {
        super.A04(bundle);
        this.A01 = Pxj.A0Y(bundle);
        boolean z = bundle.getBoolean("is_short_version", false);
        this.A04 = z;
        if (!z) {
            this.A00.markerStart(110177888);
        }
        this.A05 = bundle.getBoolean("use_transactions_v1", false);
        if (!this.A04) {
            this.A08.Cgl("fbpay_transactions_page_display", C2818159r.A06(this.A01));
        }
    }
}
