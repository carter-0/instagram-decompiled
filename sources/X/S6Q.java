package X;

import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class S6Q {
    public boolean A00 = true;
    public final SPQ A01;
    public final C13817Thl A02;
    public final C12179SoU A03;
    public final Object A04;

    public final void A01(C11230SGo sGo, 0sP r8) {
        C13888TjB tjB;
        LinkedHashMap A032;
        Map map;
        String str;
        C13888TjB tjB2;
        String str2;
        int i = sGo.A00;
        C13817Thl thl = this.A02;
        0sm BOA = thl.BOA();
        if (i == 0) {
            if (this instanceof QYC) {
                tjB2 = this.A01.A00;
                str2 = "client_execute_iap_store_query_purchases_success";
            } else if (this instanceof QY8) {
                tjB2 = this.A01.A00;
                str2 = "client_execute_iap_store_start_connection_success";
            } else if (this instanceof QYD) {
                tjB2 = this.A01.A00;
                str2 = "client_execute_iap_store_query_sku_details_success";
            } else if (this instanceof QYB) {
                tjB2 = this.A01.A00;
                str2 = "client_execute_iap_store_query_purchase_hist_success";
            } else if (this instanceof QYA) {
                tjB2 = this.A01.A00;
                str2 = "client_execute_iap_store_query_product_details_success";
            } else if (this instanceof QYE) {
                tjB2 = this.A01.A00;
                str2 = "client_execute_iap_store_launch_billing_flow_success";
            } else {
                boolean z = this instanceof QY9;
                tjB2 = this.A01.A00;
                if (z) {
                    str2 = "client_execute_iap_store_consume_success";
                } else {
                    str2 = "client_execute_iap_store_acknowledge_purchases_success";
                }
            }
            tjB2.Cgp(BOA, (Map) null, str2);
        } else {
            if (this instanceof QY8) {
                tjB = this.A01.A00;
                if (BOA == null) {
                    BOA = 0Yt.A0E();
                }
                A032 = 0Yt.A03(BOA);
                SKS.A00(sGo, A032);
                map = null;
                str = "client_execute_iap_store_start_connection_fail";
            } else if (this instanceof QYD) {
                tjB = this.A01.A00;
                if (BOA == null) {
                    BOA = 0Yt.A0E();
                }
                A032 = 0Yt.A03(BOA);
                SKS.A00(sGo, A032);
                map = null;
                str = "client_execute_iap_store_query_sku_details_fail";
            } else if (this instanceof QYC) {
                tjB = this.A01.A00;
                if (BOA == null) {
                    BOA = 0Yt.A0E();
                }
                A032 = 0Yt.A03(BOA);
                SKS.A00(sGo, A032);
                map = null;
                str = "client_execute_iap_store_query_purchases_fail";
            } else if (this instanceof QYB) {
                tjB = this.A01.A00;
                if (BOA == null) {
                    BOA = 0Yt.A0E();
                }
                A032 = 0Yt.A03(BOA);
                SKS.A00(sGo, A032);
                map = null;
                str = "client_execute_iap_store_query_purchase_hist_fail";
            } else if (this instanceof QYA) {
                tjB = this.A01.A00;
                if (BOA == null) {
                    BOA = 0Yt.A0E();
                }
                A032 = 0Yt.A03(BOA);
                SKS.A00(sGo, A032);
                map = null;
                str = "client_execute_iap_store_query_product_details_fail";
            } else if (this instanceof QYE) {
                tjB = this.A01.A00;
                if (BOA == null) {
                    BOA = 0Yt.A0E();
                }
                A032 = 0Yt.A03(BOA);
                SKS.A00(sGo, A032);
                map = null;
                str = "client_execute_iap_store_launch_billing_flow_fail";
            } else {
                boolean z2 = this instanceof QY9;
                tjB = this.A01.A00;
                if (z2) {
                    if (BOA == null) {
                        BOA = 0Yt.A0E();
                    }
                    A032 = 0Yt.A03(BOA);
                    SKS.A00(sGo, A032);
                    map = null;
                    str = "client_execute_iap_store_consume_fail";
                } else {
                    if (BOA == null) {
                        BOA = 0Yt.A0E();
                    }
                    A032 = 0Yt.A03(BOA);
                    SKS.A00(sGo, A032);
                    map = null;
                    str = "client_execute_iap_store_acknowledge_purchases_fail";
                }
            }
            tjB.Cgp(A032, map, str);
        }
        if (Pxf.A1U(C12179SoU.A05, sGo.A00) && thl.AJl()) {
            long B2S = thl.B2S();
            thl.EAk();
            if (B2S > 0) {
                this.A03.A01.postDelayed(new TC5(this), B2S);
            } else {
                A00();
            }
        } else if (!this.A00 || sGo.A00 != -1 || !thl.AJl()) {
            r8.invoke(this.A04);
        } else {
            long B2S2 = thl.B2S();
            thl.EAk();
            this.A00 = false;
            C12179SoU soU = this.A03;
            soU.A04.add(this);
            int i2 = (B2S2 > 0 ? 1 : (B2S2 == 0 ? 0 : -1));
            Handler handler = soU.A01;
            if (i2 > 0) {
                handler.postDelayed(soU.A03, B2S2);
            } else {
                handler.post(soU.A03);
            }
        }
    }

    public final void A00() {
        C13888TjB tjB;
        String str;
        C13817Thl thl = this.A02;
        Map BOA = thl.BOA();
        if (this instanceof QYC) {
            tjB = this.A01.A00;
            str = "client_execute_iap_store_query_purchases_init";
        } else if (this instanceof QY8) {
            tjB = this.A01.A00;
            str = "client_execute_iap_store_start_connection_init";
        } else if (this instanceof QYD) {
            tjB = this.A01.A00;
            str = "client_execute_iap_store_query_sku_details_init";
        } else if (this instanceof QYB) {
            tjB = this.A01.A00;
            str = "client_execute_iap_store_query_purchase_hist_init";
        } else if (this instanceof QYA) {
            tjB = this.A01.A00;
            str = "client_execute_iap_store_query_product_details_init";
        } else if (this instanceof QYE) {
            tjB = this.A01.A00;
            str = "client_execute_iap_store_launch_billing_flow_init";
        } else {
            boolean z = this instanceof QY9;
            tjB = this.A01.A00;
            if (z) {
                str = "client_execute_iap_store_consume_init";
            } else {
                str = "client_execute_iap_store_acknowledge_purchases_init";
            }
        }
        tjB.Cgp(BOA, (Map) null, str);
        if (this.A00) {
            C12179SoU soU = this.A03;
            if (!soU.A00.A0F()) {
                QY8 qy8 = new QY8(new C11827ShD(this, 0), thl.AKi(), soU);
                qy8.A00 = false;
                qy8.A00();
                return;
            }
        }
        A02(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.RnZ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.Rna, java.lang.Object] */
    public final void A02(Object obj) {
        if (this instanceof QYC) {
            QYC qyc = (QYC) this;
            C13525Tbu tbu = (C13525Tbu) obj;
            0qQ.A0B(tbu, 0);
            qyc.A01.A00.A0D(tbu, qyc.A00);
        } else if (this instanceof QY8) {
            QY8 qy8 = (QY8) this;
            C12179SoU soU = qy8.A00;
            soU.A04.add(qy8);
            soU.A01.post(soU.A03);
        } else if (this instanceof QYD) {
            QYD qyd = (QYD) this;
            C13527Tbw tbw = (C13527Tbw) obj;
            0qQ.A0B(tbw, 0);
            qyd.A01.A00.A0E(qyd.A00, tbw);
        } else if (this instanceof QYB) {
            QYB qyb = (QYB) this;
            C13524Tbt tbt = (C13524Tbt) obj;
            0qQ.A0B(tbt, 0);
            qyb.A00.A00.A0C(tbt, qyb.A01);
        } else if (this instanceof QYA) {
            QYA qya = (QYA) this;
            C13523Tbs tbs = (C13523Tbs) obj;
            0qQ.A0B(tbs, 0);
            qya.A01.A00.A0B(tbs, qya.A00);
        } else if (this instanceof QYE) {
            QYE qye = (QYE) this;
            C13559TcY tcY = (C13559TcY) obj;
            0qQ.A0B(tcY, 0);
            C11230SGo A06 = qye.A02.A00.A06(qye.A00, qye.A01);
            0qQ.A07(A06);
            tcY.DN0(A06);
        } else if (this instanceof QY9) {
            QY9 qy9 = (QY9) this;
            C13522Tbr tbr = (C13522Tbr) obj;
            0qQ.A0B(tbr, 0);
            String str = qy9.A01;
            ? obj2 = new Object();
            obj2.A00 = str;
            qy9.A00.A00.A0A(obj2, tbr);
        } else {
            QY7 qy7 = (QY7) this;
            C13521Tbq tbq = (C13521Tbq) obj;
            0qQ.A0B(tbq, 0);
            String str2 = qy7.A01;
            ? obj3 = new Object();
            obj3.A00 = str2;
            qy7.A00.A00.A08(obj3, tbq);
        }
    }

    public S6Q(C13817Thl thl, C12179SoU soU, Object obj) {
        this.A04 = obj;
        this.A03 = soU;
        this.A02 = thl;
        this.A01 = soU.A02;
    }
}
