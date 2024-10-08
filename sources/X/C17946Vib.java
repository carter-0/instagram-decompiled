package X;

import com.instagram.api.schemas.ElectionAddYoursInfoDict;
import com.instagram.api.schemas.ElectionAddYoursInfoDictIntf;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryPromptFailureTooltipDict;
import com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDictImpl;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StoryTemplateDict;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Vib  reason: case insensitive filesystem */
public class C17946Vib {
    public int A00;
    public ElectionAddYoursInfoDictIntf A01;
    public GenAIToolInfoDictIntf A02;
    public StoryPromptDisablementState A03;
    public StoryPromptFailureTooltipDictIntf A04;
    public StoryPromptParticipationFrictionInfoDict A05;
    public StoryPromptType A06;
    public StoryTemplateDictIntf A07;
    public User A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public List A0R;
    public final StoryPromptTappableDataIntf A0S;

    public final StoryPromptTappableData A00() {
        ElectionAddYoursInfoDict electionAddYoursInfoDict;
        StoryPromptParticipationFrictionInfoDictImpl storyPromptParticipationFrictionInfoDictImpl;
        StoryPromptFailureTooltipDict storyPromptFailureTooltipDict;
        StoryTemplateDict storyTemplateDict;
        GenAIToolInfoDict genAIToolInfoDict = null;
        AnonymousClass7TH.A0K();
        String str = this.A0L;
        StoryPromptDisablementState storyPromptDisablementState = this.A03;
        ElectionAddYoursInfoDictIntf electionAddYoursInfoDictIntf = this.A01;
        if (electionAddYoursInfoDictIntf != null) {
            electionAddYoursInfoDict = electionAddYoursInfoDictIntf.F2j();
        } else {
            electionAddYoursInfoDict = null;
        }
        List list = this.A0R;
        GenAIToolInfoDictIntf genAIToolInfoDictIntf = this.A02;
        if (genAIToolInfoDictIntf != null) {
            genAIToolInfoDict = genAIToolInfoDictIntf.F3O();
        }
        Boolean bool = this.A09;
        String str2 = this.A0M;
        Boolean bool2 = this.A0A;
        Boolean bool3 = this.A0B;
        Boolean bool4 = this.A0C;
        Boolean bool5 = this.A0D;
        Boolean bool6 = this.A0E;
        Boolean bool7 = this.A0F;
        Boolean bool8 = this.A0G;
        Boolean bool9 = this.A0H;
        Boolean bool10 = this.A0I;
        Boolean bool11 = this.A0J;
        Boolean bool12 = this.A0K;
        String str3 = this.A0N;
        User user = this.A08;
        int i = this.A00;
        StoryPromptParticipationFrictionInfoDict storyPromptParticipationFrictionInfoDict = this.A05;
        if (storyPromptParticipationFrictionInfoDict != null) {
            storyPromptParticipationFrictionInfoDictImpl = storyPromptParticipationFrictionInfoDict.FAq();
        } else {
            storyPromptParticipationFrictionInfoDictImpl = null;
        }
        StoryPromptFailureTooltipDictIntf storyPromptFailureTooltipDictIntf = this.A04;
        if (storyPromptFailureTooltipDictIntf != null) {
            storyPromptFailureTooltipDict = storyPromptFailureTooltipDictIntf.FAp();
        } else {
            storyPromptFailureTooltipDict = null;
        }
        String str4 = this.A0O;
        StoryPromptType storyPromptType = this.A06;
        String str5 = this.A0P;
        StoryTemplateDictIntf storyTemplateDictIntf = this.A07;
        if (storyTemplateDictIntf != null) {
            storyTemplateDict = storyTemplateDictIntf.FBY();
        } else {
            storyTemplateDict = null;
        }
        return new StoryPromptTappableData(electionAddYoursInfoDict, genAIToolInfoDict, storyPromptDisablementState, storyPromptFailureTooltipDict, storyPromptParticipationFrictionInfoDictImpl, storyPromptType, storyTemplateDict, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, str, str2, str3, str4, str5, this.A0Q, list, i);
    }

    public C17946Vib(StoryPromptTappableDataIntf storyPromptTappableDataIntf) {
        this.A0S = storyPromptTappableDataIntf;
        this.A0L = storyPromptTappableDataIntf.getBackgroundColor();
        this.A03 = storyPromptTappableDataIntf.Axh();
        this.A01 = storyPromptTappableDataIntf.B0N();
        this.A0R = storyPromptTappableDataIntf.B3f();
        this.A02 = storyPromptTappableDataIntf.B91();
        this.A09 = storyPromptTappableDataIntf.BBm();
        this.A0M = storyPromptTappableDataIntf.getId();
        this.A0A = storyPromptTappableDataIntf.CPO();
        this.A0B = storyPromptTappableDataIntf.CQE();
        this.A0C = storyPromptTappableDataIntf.CQh();
        this.A0D = storyPromptTappableDataIntf.CTy();
        this.A0E = storyPromptTappableDataIntf.CUt();
        this.A0F = storyPromptTappableDataIntf.CYj();
        this.A0G = storyPromptTappableDataIntf.CZB();
        this.A0H = storyPromptTappableDataIntf.CcH();
        this.A0I = storyPromptTappableDataIntf.Ccg();
        this.A0J = storyPromptTappableDataIntf.Cdf();
        this.A0K = storyPromptTappableDataIntf.Cej();
        this.A0N = storyPromptTappableDataIntf.getMediaId();
        this.A08 = storyPromptTappableDataIntf.BYz();
        this.A00 = storyPromptTappableDataIntf.Bak();
        this.A05 = storyPromptTappableDataIntf.Ban();
        this.A04 = storyPromptTappableDataIntf.Bho();
        this.A0O = storyPromptTappableDataIntf.Bhs();
        this.A06 = storyPromptTappableDataIntf.Bhw();
        this.A0P = storyPromptTappableDataIntf.Bzk();
        this.A07 = storyPromptTappableDataIntf.C1M();
        this.A0Q = storyPromptTappableDataIntf.getText();
    }
}
