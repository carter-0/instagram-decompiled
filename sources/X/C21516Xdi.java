package X;

import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.StoryPromptDisablementState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Xdi  reason: case insensitive filesystem */
public final class C21516Xdi {
    public static XPJ parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            while (r13.A1J() != 16L.A09) {
                String A02 = 16P.A02(r13);
                if ("aggregation_info".equals(A02)) {
                    r1.A02 = C63027KqI.parseFromJson(r13);
                } else if ("allow_template_deletion".equals(A02)) {
                    r1.A07 = Boolean.valueOf(r13.A0d());
                } else if ("anonymous_prompt_explanation".equals(A02)) {
                    r1.A03 = C63030KqL.parseFromJson(r13);
                } else {
                    ArrayList arrayList = null;
                    if (AnonymousClass000.A00(1124).equals(A02)) {
                        r1.A00 = XVo.A00(AnonymousClass7TG.A0l(r13));
                    } else if ("disablement_state".equals(A02)) {
                        r1.A04 = C281995Aj.A00(AnonymousClass7TG.A0l(r13));
                    } else if ("disclaimer_text".equals(A02)) {
                        r1.A09 = AnonymousClass7TG.A0l(r13);
                    } else if (AnonymousClass000.A00(1623).equals(A02)) {
                        r1.A01 = XVo.A00(AnonymousClass7TG.A0l(r13));
                    } else if ("original_prompt".equals(A02)) {
                        r1.A05 = C63031KqM.parseFromJson(r13);
                    } else if ("participations".equals(A02)) {
                        if (r13.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r13.A1J() != 16L.A08) {
                                C61122JxY parseFromJson = C44424Cei.parseFromJson(r13);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r1.A0A = arrayList;
                    } else if ("remaining_user_ids_to_materialize".equals(A02)) {
                        if (r13.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r13.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r13, arrayList);
                            }
                        }
                        r1.A0B = arrayList;
                    } else if ("subsequent_page_size".equals(A02)) {
                        r1.A08 = AnonymousClass7TF.A0X(r13);
                    } else {
                        1XY.A01(r13, r1, A02);
                    }
                }
                r13.A0z();
            }
            C61118JxU jxU = r1.A02;
            Boolean bool = r1.A07;
            0qQ.A0A(bool);
            boolean booleanValue = bool.booleanValue();
            C61120JxW jxW = r1.A03;
            MediaPromptPrefType mediaPromptPrefType = r1.A00;
            0qQ.A0A(mediaPromptPrefType);
            StoryPromptDisablementState storyPromptDisablementState = r1.A04;
            0qQ.A0A(storyPromptDisablementState);
            String str = r1.A09;
            0qQ.A0A(str);
            MediaPromptPrefType mediaPromptPrefType2 = r1.A01;
            0qQ.A0A(mediaPromptPrefType2);
            C61121JxX jxX = r1.A05;
            0qQ.A0A(jxX);
            List list = r1.A0A;
            0qQ.A0A(list);
            List list2 = r1.A0B;
            Integer num = r1.A08;
            0qQ.A0A(num);
            r1.A06 = new C61123JxZ(mediaPromptPrefType, mediaPromptPrefType2, jxU, jxW, storyPromptDisablementState, jxX, str, list, list2, num.intValue(), booleanValue);
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
