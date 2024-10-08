package androidx.compose.foundation.text;

import X.0eS;
import X.0sK;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C284945Oz;
import X.C287605aT;
import X.C289295dM;
import X.C52359GPe;
import X.C59674JTf;
import X.C60340gF;
import X.MX4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public /* synthetic */ long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C287605aT A03;
    public final /* synthetic */ C284945Oz A04;
    public final /* synthetic */ C262224Cq A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(C287605aT r2, C284945Oz r3, AnonymousClass4D7 r4, C262224Cq r5) {
        super(3, r4);
        this.A05 = r5;
        this.A04 = r3;
        this.A03 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C289295dM) obj2).A00;
        C262224Cq r5 = this.A05;
        C284945Oz r4 = this.A04;
        TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.A03, r4, (AnonymousClass4D7) obj3, r5);
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.A02 = obj;
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.A01 = j;
        return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.4D7, androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1] */
    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            long j = this.A01;
            AnonymousClass7TE.A1Z(new C52359GPe((Object) this.A04, (Object) this.A03, (AnonymousClass4D7) null, 3, j), this.A05);
            this.A00 = 1;
            obj = ((MX4) this.A02).FI7(this);
            if (obj == r2) {
                return r2;
            }
        }
        boolean A1a = AnonymousClass7TE.A1a(obj);
        AnonymousClass7TE.A1Z(new C59674JTf((Object) this.A04, A1a, (Object) this.A03, (AnonymousClass4D7) null, 1), this.A05);
        return C60340gF.A00;
    }
}
