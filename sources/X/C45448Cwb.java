package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.Cwb  reason: case insensitive filesystem */
public class C45448Cwb {
    public AnonymousClass5DW A00;
    public AnonymousClass5DW A01;
    public Boolean A02;
    public Boolean A03;
    public Float A04;
    public Integer A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public final AnonymousClass5DY A0F;

    public final AnonymousClass5DY A00() {
        AnonymousClass5DV r3;
        Object r2;
        TreeUpdaterJNI treeUpdaterJNI;
        AnonymousClass5DY r1 = this.A0F;
        if (r1 instanceof C43923CJe) {
            TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
            0eP A1L = AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A07);
            0eP A1L2 = AnonymousClass7TE.A1L("image_height", this.A05);
            0eP A1L3 = AnonymousClass7TE.A1L("image_width", this.A06);
            0eP A1L4 = AnonymousClass7TE.A1L("is_save_allowed", Boolean.valueOf(this.A0E));
            0eP A1L5 = AnonymousClass7TE.A1L("is_saved", this.A02);
            0eP A1L6 = AnonymousClass7TE.A1L("is_trending", this.A03);
            0eP A1L7 = AnonymousClass7TE.A1L("media_url", this.A08);
            0eP A1L8 = AnonymousClass7TE.A1L("source_media_id", this.A09);
            AnonymousClass5DW r22 = this.A00;
            TreeUpdaterJNI treeUpdaterJNI3 = null;
            if (r22 != null) {
                treeUpdaterJNI = r22.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            0eP A1L9 = AnonymousClass7TE.A1L("source_media_owner", treeUpdaterJNI);
            0eP A1L10 = AnonymousClass7TE.A1L("source_media_username", this.A0A);
            AnonymousClass5DW r23 = this.A01;
            if (r23 != null) {
                treeUpdaterJNI3 = r23.FHC();
            }
            r2 = C41847B3o.A0o(r1, new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, AnonymousClass7TE.A1L("sticker_creator", treeUpdaterJNI3), AnonymousClass7TE.A1L("sticker_creator_username", this.A0B), AnonymousClass7TE.A1L("sticker_duration", AnonymousClass7TH.A0D(this.A04)), AnonymousClass7TE.A1L("sticker_type", this.A0C), AnonymousClass7TE.A1L("strong_id__", this.A0D)});
        } else {
            String str = this.A07;
            Integer num = this.A05;
            Integer num2 = this.A06;
            boolean z = this.A0E;
            Boolean bool = this.A02;
            Boolean bool2 = this.A03;
            String str2 = this.A08;
            String str3 = this.A09;
            AnonymousClass5DW r24 = this.A00;
            AnonymousClass5DV r4 = null;
            if (r24 != null) {
                r3 = r24.F2d();
            } else {
                r3 = null;
            }
            String str4 = this.A0A;
            AnonymousClass5DW r25 = this.A01;
            if (r25 != null) {
                r4 = r25.F2d();
            }
            r2 = new AnonymousClass5DX(r3, r4, bool, bool2, this.A04, num, num2, str, str2, str3, str4, this.A0B, this.A0C, this.A0D, z);
        }
        return (AnonymousClass5DY) r2;
    }

    public C45448Cwb(AnonymousClass5DY r2) {
        this.A0F = r2;
        this.A07 = r2.getId();
        this.A05 = r2.BG7();
        this.A06 = r2.BGQ();
        this.A0E = r2.CbA();
        this.A02 = r2.CbB();
        this.A03 = r2.Cdc();
        this.A08 = r2.BRI();
        this.A09 = r2.Bxn();
        this.A00 = r2.Bxp();
        this.A0A = r2.Bxs();
        this.A01 = r2.BzX();
        this.A0B = r2.BzY();
        this.A04 = r2.Bzb();
        this.A0C = r2.Bzp();
        this.A0D = r2.getStrongId();
    }
}
