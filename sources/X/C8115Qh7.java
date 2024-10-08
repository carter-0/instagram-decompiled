package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebookpay.msc.logging.LoggingData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qh7  reason: case insensitive filesystem */
public abstract class C8115Qh7 extends QDP {
    public int A00 = -1;
    public LoggingData A01;
    public List A02;
    public final AnonymousClass2gB A03 = Pxh.A0M();
    public final C319836rJ A04;

    public C8115Qh7(C319836rJ r4) {
        0qQ.A0B(r4, 1);
        this.A04 = r4;
        r4.A04.put("list_selection_fe_selector_financial_entity", new C11759Sfv(this, 1));
    }

    public boolean A0F(Bundle bundle, Integer num) {
        int i;
        Object obj = null;
        Bundle bundle2 = bundle;
        Parcelable parcelable = bundle2.getParcelable("financial_entity");
        if (parcelable != null) {
            obj = C11405SSc.A01(parcelable);
        }
        C250663lr r3 = (C250663lr) obj;
        LoggingData loggingData = (LoggingData) bundle2.getParcelable("logging_data");
        if (loggingData != null) {
            this.A01 = loggingData;
            if (r3 == null) {
                return false;
            }
            AnonymousClass2gB r2 = this.A03;
            if (0qQ.A0K(r2.A02(), r3)) {
                return false;
            }
            String optionalStringField = r3.getOptionalStringField(0, "financial_id");
            if (optionalStringField != null) {
                int i2 = this.A00;
                if (i2 == 0) {
                    i = 667749724;
                } else if (i2 != 5) {
                    if (i2 == 8) {
                        i = 667758015;
                    }
                    r2.A0B(r3);
                    return true;
                } else {
                    i = 667754853;
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    AnonymousClass2E0.A02();
                    SQ2.A02(intValue, 0, 615);
                    AnonymousClass2E0.A02();
                    SQ2.A03(optionalStringField, "financial_entity", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intValue, 0);
                }
                r2.A0B(r3);
                return true;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static C250663lr A09(C8115Qh7 qh7) {
        return (C250663lr) qh7.A03.A02();
    }

    public final LoggingData A0E() {
        LoggingData loggingData = this.A01;
        if (loggingData != null) {
            return loggingData;
        }
        0qQ.A0F("loggingData");
        throw AnonymousClass00P.createAndThrow();
    }

    public static void A0A(Bundle bundle, C8115Qh7 qh7) {
        bundle.putParcelable("logging_data", qh7.A0E());
    }

    public void A0C(Bundle bundle) {
        LoggingData loggingData;
        Object obj;
        super.A0C(bundle);
        Integer num = null;
        if (bundle != null) {
            num = DbV.A0o(bundle, "viewmodel_class");
        }
        if (num != null) {
            this.A00 = num.intValue();
            if (bundle == null || (loggingData = (LoggingData) bundle.getParcelable("logging_data")) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            this.A01 = loggingData;
            ArrayList A022 = C11405SSc.A02(bundle);
            if (A022 != null) {
                this.A02 = A022;
                Bundle bundle2 = (Bundle) this.A04.A00("list_selection_fe_selector_financial_entity");
                if (bundle2 != null) {
                    bundle = bundle2;
                }
                AnonymousClass2gB r1 = this.A03;
                if (r1.A02() == null) {
                    Parcelable parcelable = bundle.getParcelable("financial_entity");
                    if (parcelable == null || (obj = C11405SSc.A01(parcelable)) == null) {
                        List list = this.A02;
                        if (list == null) {
                            0qQ.A0F("financialEntities");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        obj = 00k.A0I(list);
                    }
                    r1.A0B(obj);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.RwX, X.QgT] */
    public final C8092Qgk A0D() {
        String str;
        C11426STk.A04();
        C8092Qgk A002 = C8092Qgk.A00(13);
        ? rwX = new C10693RwX();
        C250663lr A09 = A09(this);
        if (A09 != null) {
            str = A09.A08("company_name");
        } else {
            str = null;
        }
        rwX.A00 = new SST((C13889TjC) null, C12401StR.A01(str), RH2.A14);
        rwX.A00 = C11496SbJ.A00(this, 11);
        SRP A003 = SRP.A00();
        A003.A04 = true;
        A003.A00 = C12400StQ.A00(new Object[0], 2131962212);
        A003.A02 = AnonymousClass05K.A01;
        SO0.A00(A003, rwX);
        A002.A01(new C8083Qgb(rwX), 1);
        return A002;
    }
}
