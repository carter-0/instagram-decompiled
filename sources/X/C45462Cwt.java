package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cwt  reason: case insensitive filesystem */
public class C45462Cwt {
    public C278014w6 A00;
    public C278034w8 A01;
    public C257593xe A02;
    public C257593xe A03;
    public C257593xe A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public final C277994w4 A0E;

    public final C277984w3 A00() {
        C278004w5 r4;
        ArrayList arrayList;
        C278014w6 r0 = this.A00;
        C278024w7 r5 = null;
        if (r0 != null) {
            r4 = r0.F13();
        } else {
            r4 = null;
        }
        C257593xe r6 = this.A02;
        C257593xe r7 = this.A03;
        List<C278014w6> list = this.A0D;
        if (list != null) {
            arrayList = AnonymousClass7TG.A0r(list);
            for (C278014w6 F13 : list) {
                arrayList.add(F13.F13());
            }
        } else {
            arrayList = null;
        }
        String str = this.A08;
        C278034w8 r02 = this.A01;
        if (r02 != null) {
            r5 = r02.F59();
        }
        return new C277984w3(r4, r5, r6, r7, this.A04, this.A05, this.A06, this.A07, str, this.A09, this.A0A, this.A0B, this.A0C, arrayList);
    }

    public final C277994w4 A01() {
        Object obj;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI4;
        C277994w4 r1 = this.A0E;
        if (r1 instanceof CM7) {
            C278014w6 r0 = this.A00;
            TreeUpdaterJNI treeUpdaterJNI5 = null;
            if (r0 != null) {
                treeUpdaterJNI = r0.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            0eP A1L = AnonymousClass7TE.A1L("banner", treeUpdaterJNI);
            C257593xe r02 = this.A02;
            if (r02 != null) {
                treeUpdaterJNI2 = r02.A00();
            } else {
                treeUpdaterJNI2 = null;
            }
            0eP A1L2 = AnonymousClass7TE.A1L("banner_bloks_data", treeUpdaterJNI2);
            C257593xe r03 = this.A03;
            if (r03 != null) {
                treeUpdaterJNI3 = r03.A00();
            } else {
                treeUpdaterJNI3 = null;
            }
            0eP A1L3 = AnonymousClass7TE.A1L("bloks_data", treeUpdaterJNI3);
            List<C278014w6> list = this.A0D;
            if (list != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C278014w6 r04 : list) {
                    if (r04 != null) {
                        arrayList.add(r04.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            0eP A1L4 = AnonymousClass7TE.A1L("buttons", arrayList);
            0eP A1L5 = AnonymousClass7TE.A1L(DevServerEntity.COLUMN_DESCRIPTION, this.A08);
            C278034w8 r05 = this.A01;
            if (r05 != null) {
                treeUpdaterJNI4 = r05.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            0eP A1L6 = AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, treeUpdaterJNI4);
            0eP A1L7 = AnonymousClass7TE.A1L("misinformation_type", this.A05);
            0eP A1L8 = AnonymousClass7TE.A1L("overlay_applied_timestamp", this.A06);
            C257593xe r06 = this.A04;
            if (r06 != null) {
                treeUpdaterJNI5 = r06.A00();
            }
            obj = C41847B3o.A0o(r1, new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, AnonymousClass7TE.A1L("overlay_bloks_data", treeUpdaterJNI5), AnonymousClass7TE.A1L("overlay_layout", this.A07), AnonymousClass7TE.A1L("overlay_type", this.A09), AnonymousClass7TE.A1L(Dbh.A01(0, 10, 58), this.A0A), AnonymousClass7TE.A1L("sub_category", this.A0B), AnonymousClass7TE.A1L(DialogModule.KEY_TITLE, this.A0C)});
        } else {
            obj = A00();
        }
        return (C277994w4) obj;
    }

    public C45462Cwt(C277994w4 r2) {
        this.A0E = r2;
        this.A00 = r2.Af8();
        this.A02 = r2.Af9();
        this.A03 = r2.AgG();
        this.A0D = r2.Aj1();
        this.A08 = r2.getDescription();
        this.A01 = r2.BE7();
        this.A05 = r2.BTS();
        this.A06 = r2.BZk();
        this.A04 = r2.BZl();
        this.A07 = r2.BZn();
        this.A09 = r2.getOverlayType();
        this.A0A = r2.getSessionId();
        this.A0B = r2.getSubCategory();
        this.A0C = r2.getTitle();
    }
}
