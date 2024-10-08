package X;

import android.widget.TextView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.Fy3  reason: case insensitive filesystem */
public final class C51644Fy3 extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01 = 0;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51644Fy3(IgTextView igTextView, C47422E1q e1q, IgdsListCell igdsListCell, IgdsListCell igdsListCell2, IgdsListCell igdsListCell3, IgdsListCell igdsListCell4, IgdsListCell igdsListCell5, AnonymousClass4D7 r9) {
        super(2, r9);
        this.A02 = igdsListCell;
        this.A06 = igdsListCell2;
        this.A04 = igdsListCell3;
        this.A03 = igdsListCell4;
        this.A05 = igdsListCell5;
        this.A08 = e1q;
        this.A07 = igTextView;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Fy3, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.Fy3, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        AnonymousClass4D7 r11 = r14;
        if (this.A01 != 0) {
            C47422E1q e1q = (C47422E1q) this.A08;
            ? fy3 = new C51644Fy3((IgTextView) this.A07, e1q, (IgdsListCell) this.A02, (IgdsListCell) this.A06, (IgdsListCell) this.A04, (IgdsListCell) this.A03, (IgdsListCell) this.A05, r14);
            fy3.A00 = obj;
            return fy3;
        }
        return new C51644Fy3((C7909Qcf) this.A08, (C11224SFy) this.A02, (C11420SSw) this.A03, (C307896Rx) this.A04, (C277014uI) this.A06, (C277014uI) this.A05, (C277014uI) this.A07, (File) this.A00, r11);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.A01 != 0) {
            0eS.A00(obj);
            N4R n4r = (N4R) this.A00;
            boolean z = true;
            ((IgdsListCell) this.A02).setChecked(AnonymousClass7TF.A1W(n4r.A02, EWM.INDEFINITE));
            EWM ewm = (EWM) n4r.A02;
            ((IgdsListCell) this.A06).setChecked(AnonymousClass7TF.A1W(ewm, EWM.THREE_MONTHS));
            ((IgdsListCell) this.A04).setChecked(AnonymousClass7TF.A1W(ewm, EWM.ONE_MONTH));
            ((IgdsListCell) this.A03).setChecked(AnonymousClass7TF.A1W(ewm, EWM.ONE_DAY));
            IgdsListCell igdsListCell = (IgdsListCell) this.A05;
            if (ewm != EWM.ONE_WEEK) {
                z = false;
            }
            igdsListCell.setChecked(z);
            C47422E1q e1q = (C47422E1q) this.A08;
            TextView textView = (TextView) this.A07;
            Calendar instance = Calendar.getInstance();
            if (ewm.ordinal() == 0) {
                textView.setText(2131959350);
            } else {
                instance.add(13, ewm.A00);
                DbX.A1F(textView, e1q, new SimpleDateFormat(AnonymousClass000.A00(61), Locale.getDefault()).format(Long.valueOf(instance.getTimeInMillis())), 2131959351);
            }
            C49328Etj etj = e1q.A00;
            if (etj == null) {
                str = "delegate";
            } else {
                E4V e4v = etj.A00;
                E4V.A00(e4v).A0A.Epw(ewm);
                if (E4V.A01(e4v) == EV0.Broadcast) {
                    C313756gx A0R = DbZ.A0R(e4v.A0F);
                    1Ln A0J = DbT.A0J(A0R);
                    if (DbT.A1Y(A0J)) {
                        Dbb.A1G(A0J, A0R.A04);
                        DbV.A1M(A0J, "select_channel_duration_option");
                        Dbb.A1H(A0J, "channel_duration_sheet");
                        Dba.A1C(A0J, A0R);
                    }
                } else if (E4V.A01(e4v) == EV0.Social) {
                    C50338FYv fYv = (C50338FYv) e4v.A0H.getValue();
                    1Ln A002 = C50338FYv.A00(fYv);
                    if (DbT.A1Y(A002)) {
                        Dbb.A1G(A002, fYv.A03);
                        DbV.A1M(A002, "select_channel_duration_option");
                        A002.A0p("channel_duration_sheet");
                        C50338FYv.A05(A002, fYv, "chat_setup");
                        A002.Cgf();
                    }
                }
                return C60340gF.A00;
            }
        } else {
            0eS.A00(obj);
            C7909Qcf qcf = (C7909Qcf) this.A08;
            C66498MUb mUb = qcf.A00;
            if (mUb == null) {
                str = "uploader";
            } else {
                mUb.Ewf((C11224SFy) this.A02, (C11420SSw) this.A03, new C64385Lb2(qcf, (C307896Rx) this.A04, (C277014uI) this.A06, (C277014uI) this.A05, (C277014uI) this.A07, (File) this.A00));
                return C60340gF.A00;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C51644Fy3) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51644Fy3(C7909Qcf qcf, C11224SFy sFy, C11420SSw sSw, C307896Rx r5, C277014uI r6, C277014uI r7, C277014uI r8, File file, AnonymousClass4D7 r10) {
        super(2, r10);
        this.A08 = qcf;
        this.A03 = sSw;
        this.A02 = sFy;
        this.A06 = r6;
        this.A04 = r5;
        this.A00 = file;
        this.A05 = r7;
        this.A07 = r8;
    }
}
