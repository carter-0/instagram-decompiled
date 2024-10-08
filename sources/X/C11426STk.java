package X;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.STk  reason: case insensitive filesystem */
public final class C11426STk {
    public final QuickPerformanceLogger A00;
    public final 2FO A01;
    public final AnonymousClass0eK A02;
    public final AnonymousClass0eK A03;
    public final AnonymousClass0eK A04;
    public final AnonymousClass0eK A05;
    public final AnonymousClass0eK A06;
    public final AnonymousClass0eK A07;

    public static Su3 A01(int i) {
        Su3 su3 = new Su3(i);
        AnonymousClass2E0.A02().A0A();
        return su3;
    }

    public static C12423Su4 A02(int i) {
        C12423Su4 su4 = new C12423Su4(i);
        AnonymousClass2E0.A02().A0A();
        return su4;
    }

    public final Fragment A07(Bundle bundle, String str) {
        Fragment A012 = ((C10987S3z) this.A02.get()).A01(bundle, str);
        if (A012 != null) {
            return A012;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final 2YL A08(AnonymousClass07g r3, int i) {
        Class cls;
        2YN r1 = new 2YN(r3);
        this.A07.get();
        switch (i) {
            case 0:
                cls = C8072QgQ.class;
                break;
            case 1:
                cls = C8069QgN.class;
                break;
            case 2:
                cls = C8070QgO.class;
                break;
            case 4:
                cls = C8113Qh5.class;
                break;
            case 5:
                cls = C8071QgP.class;
                break;
            case 6:
                cls = C8116Qh8.class;
                break;
            case 7:
                cls = C8114Qh6.class;
                break;
            case 8:
                cls = C8073QgR.class;
                break;
            case 9:
                cls = C8117Qh9.class;
                break;
            case 10:
                cls = C8118QhA.class;
                break;
            case 11:
                cls = C8119QhB.class;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                cls = C8111Qh3.class;
                break;
            case 13:
                cls = C8112Qh4.class;
                break;
            default:
                throw DbW.A0a("MSCViewModelClassFactory does not support ViewModelId number ", i);
        }
        return r1.A00(cls);
    }

    public final C13450Tad A09(Class cls) {
        C13450Tad tad;
        C10817Ryd ryd = (C10817Ryd) this.A05.get();
        if (cls.equals(C12416Stt.class)) {
            tad = (C12416Stt) ryd.A02.getValue();
        } else if (cls.equals(C12413Stq.class)) {
            tad = (C12413Stq) ryd.A01.getValue();
        } else if (cls.equals(C12412Stp.class)) {
            tad = (C12412Stp) ryd.A00.getValue();
        } else if (cls.equals(C12418Stv.class)) {
            tad = (C12418Stv) ryd.A06.getValue();
        } else if (cls.equals(Stw.class)) {
            tad = (Stw) ryd.A07.getValue();
        } else if (cls.equals(C12415Sts.class)) {
            tad = (C12415Sts) ryd.A04.getValue();
        } else if (cls.equals(C12419Stx.class)) {
            tad = (C12419Stx) ryd.A08.getValue();
        } else if (cls.equals(C12417Stu.class)) {
            tad = (C12417Stu) ryd.A05.getValue();
        } else if (cls.equals(C12414Str.class)) {
            tad = (C12414Str) ryd.A03.getValue();
        } else {
            throw C51973G9u.A0g(cls, "Input repository not implemented ", AnonymousClass7TE.A1A());
        }
        0qQ.A0C(tad, "null cannot be cast to non-null type T of com.facebookpay.msc.factoryimpl.BSCRepositoryFactory.getRepository");
        return tad;
    }

    public final C10896Rzw A0A() {
        return (C10896Rzw) C66580MXl.A0s(this.A06);
    }

    public final SDg A0B() {
        return (SDg) C66580MXl.A0s(this.A04);
    }

    public C11426STk(QuickPerformanceLogger quickPerformanceLogger, 2FO r2, AnonymousClass0eK r3, AnonymousClass0eK r4, AnonymousClass0eK r5, AnonymousClass0eK r6, AnonymousClass0eK r7, AnonymousClass0eK r8) {
        AnonymousClass7TG.A1R(r4, r5);
        this.A01 = r2;
        this.A00 = quickPerformanceLogger;
        this.A02 = r3;
        this.A07 = r4;
        this.A06 = r5;
        this.A03 = r6;
        this.A05 = r7;
        this.A04 = r8;
    }

    public static 2FO A00() {
        return AnonymousClass2E0.A02().A01;
    }

    public static C10896Rzw A03() {
        return AnonymousClass2E0.A02().A0A();
    }

    public static void A04() {
        AnonymousClass2E0.A02().A0B();
    }

    public static void A05() {
        AnonymousClass2E0.A02().A0A();
    }

    public static void A06(SparseArray sparseArray, Object obj, int i) {
        sparseArray.put(i, obj);
        AnonymousClass2E0.A02().A0A();
    }
}
