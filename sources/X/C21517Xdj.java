package X;

import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.StoryPromptDisablementState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Xdj  reason: case insensitive filesystem */
public final class C21517Xdj {
    public static XPI parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            while (r11.A1J() != 16L.A09) {
                String A02 = 16P.A02(r11);
                if ("anonymous_prompt_explanation".equals(A02)) {
                    r1.A02 = C63030KqL.parseFromJson(r11);
                } else {
                    ArrayList arrayList = null;
                    if (AnonymousClass000.A00(1124).equals(A02)) {
                        r1.A00 = XVo.A00(AnonymousClass7TG.A0l(r11));
                    } else if ("disablement_state".equals(A02)) {
                        r1.A03 = C281995Aj.A00(AnonymousClass7TG.A0l(r11));
                    } else if ("disclaimer_text".equals(A02)) {
                        r1.A07 = AnonymousClass7TG.A0l(r11);
                    } else if (AnonymousClass000.A00(1623).equals(A02)) {
                        r1.A01 = XVo.A00(AnonymousClass7TG.A0l(r11));
                    } else if ("original_prompt".equals(A02)) {
                        r1.A04 = C63031KqM.parseFromJson(r11);
                    } else if ("participations".equals(A02)) {
                        if (r11.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r11.A1J() != 16L.A08) {
                                C61122JxY parseFromJson = C44424Cei.parseFromJson(r11);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r1.A08 = arrayList;
                    } else if ("remaining_user_ids_to_materialize".equals(A02)) {
                        if (r11.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r11.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r11, arrayList);
                            }
                        }
                        r1.A09 = arrayList;
                    } else if ("subsequent_page_size".equals(A02)) {
                        r1.A06 = AnonymousClass7TF.A0X(r11);
                    } else {
                        1XY.A01(r11, r1, A02);
                    }
                }
                r11.A0z();
            }
            C61120JxW jxW = r1.A02;
            MediaPromptPrefType mediaPromptPrefType = r1.A00;
            0qQ.A0A(mediaPromptPrefType);
            StoryPromptDisablementState storyPromptDisablementState = r1.A03;
            0qQ.A0A(storyPromptDisablementState);
            String str = r1.A07;
            0qQ.A0A(str);
            MediaPromptPrefType mediaPromptPrefType2 = r1.A01;
            0qQ.A0A(mediaPromptPrefType2);
            C61121JxX jxX = r1.A04;
            0qQ.A0A(jxX);
            List list = r1.A08;
            0qQ.A0A(list);
            List list2 = r1.A09;
            Integer num = r1.A06;
            0qQ.A0A(num);
            r1.A05 = new C61124Jxa(mediaPromptPrefType, mediaPromptPrefType2, jxW, storyPromptDisablementState, jxX, str, list, list2, num.intValue());
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
