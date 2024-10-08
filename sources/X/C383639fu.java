package X;

import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9fu  reason: invalid class name and case insensitive filesystem */
public final class C383639fu extends C250663lr implements C348597yi {
    public final int B5l() {
        return getCoercedIntField(5, "filesize_bytes");
    }

    public final boolean BJ6() {
        return getCoercedBooleanField(7, "is_encrypted");
    }

    public final int CBG() {
        return getCoercedIntField(6, "uncompressed_filesize_bytes");
    }

    public final String AjI() {
        return A09("cache_key");
    }

    public final C348607yj Apk() {
        return (C348607yj) getOptionalEnumField(3, TraceFieldType.CompressionType, C348607yj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final ImmutableList B03() {
        return getRequiredCompactedTreeListField(8, "effect_file_contents", C383629ft.class, -1153896853);
    }

    public final String BPb() {
        return A0B("md5_hash");
    }

    public final String getId() {
        return A07("strong_id__");
    }

    public final String getUri() {
        return A08("uri");
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 A0I = AnonymousClass7TF.A0I(r1);
        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "uri");
        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "cache_key");
        AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r1, TraceFieldType.CompressionType);
        AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r1, "md5_hash");
        AnonymousClass4L8 r12 = AnonymousClass4L8.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0I, A0f, A0f2, A0f3, A0f4, AnonymousClass7TE.A0f(r12, "filesize_bytes"), AnonymousClass7TE.A0f(r12, "uncompressed_filesize_bytes"), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "is_encrypted"), new AnonymousClass4Kp(AnonymousClass4Ks.A02(), C383629ft.class, "effect_file_contents", -1153896853)});
    }

    public C383639fu(int i) {
        super(i);
    }

    public C383639fu() {
        super(-1040728851);
    }
}
