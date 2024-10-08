package X;

import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;

public final class DFS implements AnonymousClass2Kv {
    public final /* synthetic */ C313006fb A00;
    public final /* synthetic */ S0H A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0sP A03;

    public DFS(C313006fb r1, S0H s0h, String str, 0sP r4) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = s0h;
        this.A03 = r4;
    }

    public final void invoke(AnonymousClass3JD r19) {
        IllegalStateException illegalStateException;
        try {
            C313006fb r10 = this.A00;
            if (r19 != null) {
                String str = this.A02;
                Object Bny = r19.Bny();
                C250663lr r5 = (C250663lr) Bny;
                if (r5 != null) {
                    Class<BVS> cls = BVS.class;
                    if (r5.getOptionalTreeField(0, "ar_block_metadata(block_ids:$block_ids,device_capabilities:$device_capabilities,effect_id:$effect_id,supported_compression_types:$supported_compression_types,supported_texture_formats:$supported_texture_formats)", cls, 1000779290) != null) {
                        ImmutableList.Builder builder = ImmutableList.builder();
                        0qQ.A0A(Bny);
                        C250663lr optionalTreeField = r5.getOptionalTreeField(0, "ar_block_metadata(block_ids:$block_ids,device_capabilities:$device_capabilities,effect_id:$effect_id,supported_compression_types:$supported_compression_types,supported_texture_formats:$supported_texture_formats)", cls, 1000779290);
                        0qQ.A0A(optionalTreeField);
                        C249803kO it = C41845B3m.A0X(optionalTreeField, BVR.class, "blocks", 0, -590913784).iterator();
                        0qQ.A07(it);
                        while (it.hasNext()) {
                            C250663lr A0V = C41845B3m.A0V(it);
                            if (A0V.getOptionalStringField(0, "block_id") != null) {
                                Class<BVQ> cls2 = BVQ.class;
                                if (A0V.getOptionalTreeField(1, "best_instance", cls2, -436609096) != null) {
                                    C250663lr optionalTreeField2 = A0V.getOptionalTreeField(1, "best_instance", cls2, -436609096);
                                    0qQ.A0A(optionalTreeField2);
                                    C250663lr reinterpretRequired = optionalTreeField2.reinterpretRequired(0, BSZ.class, -735820653);
                                    0qQ.A07(reinterpretRequired);
                                    if (reinterpretRequired.getOptionalStringField(0, "strong_id__") != null) {
                                        Class<BSY> cls3 = BSY.class;
                                        String A002 = AnonymousClass000.A00(733);
                                        if (reinterpretRequired.getOptionalTreeField(1, A002, cls3, -580457830) != null) {
                                            C250663lr optionalTreeField3 = reinterpretRequired.getOptionalTreeField(1, A002, cls3, -580457830);
                                            0qQ.A0A(optionalTreeField3);
                                            if (optionalTreeField3.A09("cache_key") != null) {
                                                C16660Uyw uyw = C16660Uyw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                                                if (!(optionalTreeField3.getOptionalEnumField(3, TraceFieldType.CompressionType, uyw) == null || optionalTreeField3.getOptionalStringField(1, "uri") == null)) {
                                                    String optionalStringField = A0V.getOptionalStringField(0, "block_id");
                                                    0qQ.A0A(optionalStringField);
                                                    0qQ.A0A(reinterpretRequired.getOptionalStringField(0, "strong_id__"));
                                                    String A09 = optionalTreeField3.A09("cache_key");
                                                    0qQ.A0A(A09);
                                                    String optionalStringField2 = optionalTreeField3.getOptionalStringField(1, "uri");
                                                    0qQ.A0A(optionalStringField2);
                                                    C16660Uyw uyw2 = (C16660Uyw) optionalTreeField3.getOptionalEnumField(3, TraceFieldType.CompressionType, uyw);
                                                    0qQ.A0A(uyw2);
                                                    String name = uyw2.name();
                                                    optionalTreeField3.getOptionalStringField(4, "md5_hash");
                                                    optionalTreeField3.getCoercedIntField(5, "filesize_bytes");
                                                    AnonymousClass7TF.A1B(optionalStringField, 0, A09);
                                                    0qQ.A0B(optionalStringField2, 3);
                                                    0qQ.A0B(name, 4);
                                                    builder.add(new C10665Rvz(optionalStringField, A09, optionalStringField2, name));
                                                }
                                            }
                                            illegalStateException = AnonymousClass7TE.A0z(002.A0R("bestInstance asset fragment is missing critical data. instance id:", reinterpretRequired.getOptionalStringField(0, "strong_id__")));
                                        }
                                    }
                                    illegalStateException = AnonymousClass7TE.A0z(002.A0R("bestInstance fragment is missing critical data. block id:", A0V.getOptionalStringField(0, "block_id")));
                                }
                            }
                            illegalStateException = AnonymousClass7TE.A0z(002.A0R("block id/metadata is null. requested id:", str));
                        }
                        ImmutableList build = builder.build();
                        0qQ.A07(build);
                        if (!build.isEmpty()) {
                            r10.A03.put(str, build.get(0));
                            S0H s0h = this.A01;
                            Object obj = build.get(0);
                            0qQ.A07(obj);
                            s0h.A00((C10665Rvz) obj);
                            return;
                        }
                        this.A03.invoke(AnonymousClass7TE.A0z("server responds with empty blockv5 metadata"));
                        return;
                    }
                }
                illegalStateException = AnonymousClass7TE.A0z("server response is null");
            } else {
                illegalStateException = AnonymousClass7TE.A0y();
            }
            throw illegalStateException;
        } catch (IllegalStateException e) {
            this.A03.invoke(e);
        }
    }
}
