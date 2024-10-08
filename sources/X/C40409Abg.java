package X;

import com.instagram.clips.template.creation.model.ClipsTemplateModel;
import java.util.List;

/* renamed from: X.Abg  reason: case insensitive filesystem */
public final class C40409Abg implements B1S {
    public final ClipsTemplateModel A00;
    public final C370018vh A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public final Object Cor(C293505kq r4, AnonymousClass4D7 r5) {
        C59765JXe jXe = new C59765JXe();
        jXe.A0i = new C59764JXc(this.A01);
        jXe.A0n = new C59764JXc(this.A04);
        jXe.A01 = new C59764JXc(this.A02);
        jXe.A0l = new C59764JXc(this.A03);
        jXe.A04(this.A00);
        return jXe.A01(r4);
    }

    public C40409Abg(ClipsTemplateModel clipsTemplateModel, C370018vh r2, List list, List list2, List list3) {
        this.A01 = r2;
        this.A04 = list;
        this.A02 = list2;
        this.A03 = list3;
        this.A00 = clipsTemplateModel;
    }
}
