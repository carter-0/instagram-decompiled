package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.HashMap;

/* renamed from: X.Qh5  reason: case insensitive filesystem */
public final class C8113Qh5 extends QDP {
    public C13931TlZ A00;
    public SUj A01 = SUj.A02();
    public ImmutableList A02;
    public String A03;
    public LoggingData A04;
    public final AnonymousClass2gB A05 = Pxh.A0M();
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(C13318TUr.A00);

    /* JADX WARNING: type inference failed for: r0v60, types: [X.RwX, X.QgW] */
    public final void A0C(Bundle bundle) {
        String str;
        LoggingData loggingData;
        Object A012;
        String str2;
        String str3;
        C8938RGg rGg;
        C13889TjC ssm;
        C13889TjC tjC;
        C12397Ssl ssl;
        String BbE;
        String BbD;
        C12400StQ A002;
        String str4;
        SST sst;
        String str5;
        String BbD2;
        Bundle bundle2 = bundle;
        super.A0C(bundle2);
        String str6 = null;
        if (bundle != null) {
            str = bundle2.getString("financial_entity_id");
        } else {
            str = null;
        }
        if (str != null) {
            this.A03 = str;
            if (bundle == null || (loggingData = (LoggingData) bundle2.getParcelable("logging_data")) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            this.A04 = loggingData;
            Parcelable parcelable = bundle2.getParcelable("payout_batch_item");
            if (parcelable == null || (A012 = C11405SSc.A01(parcelable)) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            C13931TlZ tlZ = (C13931TlZ) A012;
            this.A00 = tlZ;
            AnonymousClass2Fj r3 = this.A07;
            if (tlZ == null) {
                0qQ.A0F("payoutActivityItem");
                throw AnonymousClass00P.createAndThrow();
            }
            C13928TlW BbC = tlZ.BbC();
            if (BbC != null) {
                str6 = BbC.BbB();
            }
            r3.A0B(new S62(C12401StR.A01(str6), ImmutableList.of(), false));
            ImmutableList.Builder builder = ImmutableList.builder();
            0qQ.A0A(builder);
            C13931TlZ tlZ2 = this.A00;
            String str7 = "payoutActivityItem";
            if (tlZ2 != null) {
                C13929TlX BbF = tlZ2.BbF();
                if (BbF != null) {
                    str2 = BbF.BbE();
                } else {
                    str2 = null;
                }
                C12401StR A013 = C12401StR.A01(str2);
                C13931TlZ tlZ3 = this.A00;
                if (tlZ3 != null) {
                    C13929TlX BbF2 = tlZ3.BbF();
                    if (BbF2 != null) {
                        str3 = BbF2.BbD();
                    } else {
                        str3 = null;
                    }
                    C12401StR A014 = C12401StR.A01(str3);
                    C13931TlZ tlZ4 = this.A00;
                    if (tlZ4 != null) {
                        C13929TlX BbF3 = tlZ4.BbF();
                        if (BbF3 != null) {
                            rGg = BbF3.BbA();
                        } else {
                            rGg = null;
                        }
                        if (rGg == C8938RGg.PAYPAL) {
                            tjC = null;
                            ssm = new C12397Ssl((Integer) null, (Integer) null, R.drawable.payment_paypal, 0);
                            C13931TlZ tlZ5 = this.A00;
                            if (tlZ5 != null) {
                                C13929TlX BbF4 = tlZ5.BbF();
                                if (BbF4 == null || (BbD2 = BbF4.BbD()) == null) {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                                A002 = C12400StQ.A00(new Object[]{BbD2}, 2131969255);
                                ssl = null;
                            }
                        } else {
                            ssm = new C12398Ssm(Pxe.A0l(), 4, 0, 1);
                            tjC = null;
                            ssl = new C12397Ssl((Integer) null, 14, R.drawable.rounded_icon_background, R.dimen.account_recs_header_image_margin);
                            C13931TlZ tlZ6 = this.A00;
                            if (tlZ6 != null) {
                                C13929TlX BbF5 = tlZ6.BbF();
                                if (BbF5 == null || (BbE = BbF5.BbE()) == null) {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                                C13931TlZ tlZ7 = this.A00;
                                if (tlZ7 != null) {
                                    C13929TlX BbF6 = tlZ7.BbF();
                                    if (BbF6 == null || (BbD = BbF6.BbD()) == null) {
                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                    }
                                    A002 = C12400StQ.A00(new Object[]{BbE, BbD}, 2131969254);
                                }
                            }
                        }
                        C8092Qgk A003 = C8092Qgk.A00(23);
                        C8080QgY A004 = C8080QgY.A00();
                        C13931TlZ tlZ8 = this.A00;
                        if (tlZ8 != null) {
                            C13928TlW BbC2 = tlZ8.BbC();
                            if (BbC2 != null) {
                                str4 = BbC2.BbI();
                            } else {
                                str4 = null;
                            }
                            C12401StR A015 = C12401StR.A01(str4);
                            RH2 rh2 = RH2.A1E;
                            SST.A02(A015, A004, rh2);
                            C13931TlZ tlZ9 = this.A00;
                            if (tlZ9 != null) {
                                if (tlZ9.Bb3() != null) {
                                    C13931TlZ tlZ10 = this.A00;
                                    if (tlZ10 != null) {
                                        String Bb3 = tlZ10.Bb3();
                                        DbS.A1Y(Bb3);
                                        sst = new SST(tjC, C12400StQ.A00(new Object[]{Bb3}, 2131969214), RH2.A14);
                                    }
                                } else {
                                    sst = null;
                                }
                                A004.A02 = sst;
                                A003.A01(new C8086Qge(A004), 1);
                                C8080QgY A005 = C8080QgY.A00();
                                C10887Rzn rzn = C9969RkO.A00;
                                C13931TlZ tlZ11 = this.A00;
                                if (tlZ11 != null) {
                                    RGV Bb8 = tlZ11.Bb8();
                                    if (Bb8 != null) {
                                        C13931TlZ tlZ12 = this.A00;
                                        if (tlZ12 != null) {
                                            String Bb9 = tlZ12.Bb9();
                                            if (Bb9 != null) {
                                                A005.A04 = rzn.A00(C12401StR.A01(Bb9), Bb8);
                                                A003.A06 = new C8086Qge(A005);
                                                C11345SOd.A02(A003, builder);
                                                C8092Qgk A006 = C8092Qgk.A00(0);
                                                C8080QgY A007 = C8080QgY.A00();
                                                SST.A02(C12400StQ.A00(new Object[0], 2131969250), A007, rh2);
                                                C8086Qge.A00(A006, A007, 1);
                                                C8098Qgq qgq = new C8098Qgq(A006);
                                                C8092Qgk A008 = C8092Qgk.A00(3);
                                                ? rwX = new C10693RwX();
                                                rwX.A02 = ssm;
                                                rwX.A00 = ssl;
                                                C8080QgY A009 = QDP.A00(rwX, A008);
                                                SST.A02(A013, A009, RH2.PRIMARY_TEXT);
                                                RH2 rh22 = RH2.A14;
                                                A008.A01(SST.A00(A014, A009, rh22), 1);
                                                SRP A0010 = SRP.A00();
                                                A0010.A01 = A002;
                                                A0010.A04 = false;
                                                A008.A02 = new SO0(A0010);
                                                builder.add(new C11345SOd[]{qgq, new C8098Qgq(A008)});
                                                C8092Qgk A0011 = C8092Qgk.A00(1);
                                                C8080QgY A0012 = C8080QgY.A00();
                                                C13931TlZ tlZ13 = this.A00;
                                                if (tlZ13 != null) {
                                                    C13928TlW BbC3 = tlZ13.BbC();
                                                    if (BbC3 != null) {
                                                        str5 = BbC3.BbH();
                                                    } else {
                                                        str5 = null;
                                                    }
                                                    SST.A02(C12401StR.A01(str5), A0012, rh22);
                                                    C8086Qge.A01(A0011, A0012, builder);
                                                    this.A02 = builder.build();
                                                    AnonymousClass2gB r5 = this.A05;
                                                    Object value = this.A06.getValue();
                                                    String str8 = this.A03;
                                                    if (str8 == null) {
                                                        str7 = "financialEntityId";
                                                    } else {
                                                        C13931TlZ tlZ14 = this.A00;
                                                        if (tlZ14 != null) {
                                                            String id = tlZ14.getId();
                                                            if (id != null) {
                                                                SQB.A02(C8282QnO.A00(new C11547Sc8(value, str8, id, 1), AnonymousClass2E0.A06()), r5, C11647Sdp.A00(this, 14));
                                                                return;
                                                            }
                                                            throw AnonymousClass7TE.A0z("Required value was null.");
                                                        }
                                                    }
                                                    0qQ.A0F(str7);
                                                    throw AnonymousClass00P.createAndThrow();
                                                }
                                            } else {
                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                            }
                                        }
                                    } else {
                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str7);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A02(C8113Qh5 qh5, String str, boolean z) {
        String str2;
        2FO A002 = C11426STk.A00();
        LoggingData loggingData = qh5.A04;
        if (loggingData == null) {
            str2 = "loggingData";
        } else {
            HashMap A003 = C9634ReE.A00(loggingData);
            String str3 = qh5.A03;
            if (str3 == null) {
                str2 = "financialEntityId";
            } else {
                A003.put("financial_entity_id", str3);
                A003.put("view_name", "payout_details");
                if (z) {
                    C13931TlZ tlZ = qh5.A00;
                    if (tlZ == null) {
                        str2 = "payoutActivityItem";
                    } else {
                        String valueOf = String.valueOf(tlZ.Bb3());
                        if (valueOf != null) {
                            A003.put("batch_item_id", valueOf);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                }
                A002.Cgl(str, A003);
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
