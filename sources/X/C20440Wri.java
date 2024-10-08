package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElementSerializer;

/* renamed from: X.Wri  reason: case insensitive filesystem */
public final class C20440Wri implements SerialDescriptor {
    public static final C20440Wri A01 = new C20440Wri();
    public final /* synthetic */ SerialDescriptor A00;

    public final List B0P(int i) {
        return this.A00.B0P(i);
    }

    public final SerialDescriptor B0R(int i) {
        return this.A00.B0R(i);
    }

    public final int B0T(String str) {
        0qQ.A0B(str, 0);
        return this.A00.B0T(str);
    }

    public final String B0V(int i) {
        return this.A00.B0V(i);
    }

    public final int B0a() {
        return this.A00.B0a();
    }

    public final C255513uF BKK() {
        return this.A00.BKK();
    }

    public final boolean CRn(int i) {
        return this.A00.CRn(i);
    }

    public final boolean CYM() {
        return this.A00.CYM();
    }

    public final List getAnnotations() {
        return this.A00.getAnnotations();
    }

    public final boolean isInline() {
        return this.A00.isInline();
    }

    public final String BsV() {
        return "kotlinx.serialization.json.JsonObject";
    }

    public C20440Wri() {
        C255453u9 r2 = C255453u9.A01;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        AnonymousClass7TG.A1N(r2, jsonElementSerializer);
        this.A00 = new C258613zM(r2, jsonElementSerializer).A00;
    }
}
