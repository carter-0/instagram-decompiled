package X;

import com.facebook.graphql.enums.EnumHelper;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VDy  reason: case insensitive filesystem */
public abstract class C16998VDy {
    public static C17673Vc4 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17673Vc4 vc4 = new C17673Vc4();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("allow_write_in_response".equals(A17)) {
                    vc4.A07 = r4.A0d();
                } else if ("is_required".equals(A17)) {
                    vc4.A08 = r4.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("question_id".equals(A17)) {
                        vc4.A03 = AnonymousClass7TG.A0l(r4);
                    } else if ("question_class".equals(A17)) {
                        vc4.A02 = (C16645Uyh) EnumHelper.A00(r4.A1Q(), C16645Uyh.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if ("body".equals(A17)) {
                        vc4.A00 = C18205VnV.parseFromJson(r4);
                    } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                        vc4.A01 = C18205VnV.parseFromJson(r4);
                    } else if ("subquestion_labels".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C17349VSc parseFromJson = C18205VnV.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        vc4.A05 = arrayList;
                    } else if ("survey_token_params".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C17353VSg parseFromJson2 = VE2.parseFromJson(r4);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        vc4.A06 = arrayList;
                    } else if ("response_options".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C17443VVw parseFromJson3 = VE3.parseFromJson(r4);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        vc4.A04 = arrayList;
                    }
                }
                r4.A0z();
            }
            return vc4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
