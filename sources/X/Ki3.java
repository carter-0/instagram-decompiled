package X;

import java.util.Map;

public enum Ki3 {
    ARCHIVE("archive"),
    CREATE_STORY_LONG_PRESS("create_story_long_press"),
    DIRECT_RECIPIENT_PICKER("direct_recipient_picker"),
    SELF_PROFILE("self_profile"),
    EDIT_HIGHLIGHTS("edit_highlights"),
    STORY_VIEWER_ARCHIVE("story_viewer_archive"),
    STORY_VIEWER_DEFAULT("story_viewer_default"),
    STORY_VIEWER_FEED("story_viewer_feed"),
    STORY_VIEWER_PROFILE("story_viewer_profile"),
    STORY_VIEWER_SUGGESTED_HIGHLIGHT("story_viewer_suggested_highlight"),
    STORY_VIEWER_EDIT_SUGGESTED_HIGHLIGHT("story_viewer_edit_suggested_highlight"),
    UNIVERSAL_CREATION_MENU("universal_creation_menu"),
    HIGHLIGHTS_MANAGEMENT_SCREEN("manage_highlights");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        Ki3[] ki3Arr;
        A02 = 0oU.A00(ki3Arr);
        A01 = AnonymousClass7TE.A1E();
        for (Ki3 ki3 : values()) {
            A01.put(ki3.A00, ki3);
        }
    }

    /* access modifiers changed from: public */
    Ki3(String str) {
        this.A00 = str;
    }
}
