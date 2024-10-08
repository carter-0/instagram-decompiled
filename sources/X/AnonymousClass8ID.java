package X;

/* renamed from: X.8ID  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8ID implements 02o, C61910qF {
    public final /* synthetic */ AnonymousClass8I2 A00;

    public AnonymousClass8ID(AnonymousClass8I2 r1) {
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof 02o) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 0Yk(2, this.A00, AnonymousClass8I2.class, "onTemplateSuggestion", "onTemplateSuggestion(Lcom/instagram/creation/capture/quickcapture/sundial/template/suggestion/model/ClipsTemplateSuggestionModel;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r6) {
        05G r3;
        Object r2;
        AnonymousClass8I8 r5 = (AnonymousClass8I8) obj;
        AnonymousClass8I2 r1 = this.A00;
        if (0qQ.A0K(r5, AnonymousClass8IE.A00)) {
            r3 = r1.A04;
            r2 = C378569Qi.A00;
        } else {
            if (!0qQ.A0K(r5, AnonymousClass8I7.A00)) {
                0qQ.A0C(r5, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.template.suggestion.model.ClipsTemplateSuggestionModel.Loaded");
                C382019cx r52 = (C382019cx) r5;
                r3 = r1.A04;
                r2 = new C382009cw(r52.A00, r52.A01, r52);
            }
            return C60340gF.A00;
        }
        r3.Epw(r2);
        return C60340gF.A00;
    }
}
