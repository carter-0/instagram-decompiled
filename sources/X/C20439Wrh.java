package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElementSerializer;

/* renamed from: X.Wrh  reason: case insensitive filesystem */
public final class C20439Wrh implements SerialDescriptor {
    public static final C20439Wrh A01 = new C20439Wrh();
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
        return "kotlinx.serialization.json.JsonArray";
    }

    public C20439Wrh() {
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        0qQ.A0B(jsonElementSerializer, 0);
        this.A00 = new AnonymousClass409(jsonElementSerializer).A00;
    }
}
