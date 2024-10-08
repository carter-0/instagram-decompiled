package com.instagram.debug.quickexperiment.dumper;

import X.0tS;
import X.AnonymousClass0lh;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C69565No9;
import X.C69642NpP;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.PrintStream;

public class QuickExperimentDumperPlugin {
    public static final String CLEAR_CMD = "clear";
    public static final String IMPORT_USER_CMD = "import_user";
    public static final String NAME = "qe";
    public static final String OVERRIDE_CMD = "override";
    public static UserSessionListener sLastListener;

    public class UserSessionListener implements AnonymousClass0lh {
        public final UserSession mUserSession;

        public static UserSessionListener getInstance(UserSession userSession) {
            return (UserSessionListener) userSession.A01(UserSessionListener.class, new QuickExperimentDumperPlugin$UserSessionListener$$ExternalSyntheticLambda0(userSession));
        }

        public static /* synthetic */ UserSessionListener lambda$getInstance$0(UserSession userSession) {
            return new UserSessionListener(userSession);
        }

        public UserSessionListener(UserSession userSession) {
            this.mUserSession = userSession;
        }

        public static void onUserSessionStart(UserSession userSession, Context context, boolean z) {
            0tS A00 = 0tS.A00();
            if (AnonymousClass7TG.A1a(A00, A00.A1q, 0tS.A4G, 119)) {
                QuickExperimentDumperPlugin.sLastListener = getInstance(userSession);
            }
        }

        public void onSessionWillEnd() {
            QuickExperimentDumperPlugin.clear();
            QuickExperimentDumperPlugin.sLastListener = null;
        }
    }

    public String getName() {
        return NAME;
    }

    private void usage(PrintStream printStream) {
        printStream.print(IMPORT_USER_CMD);
        printStream.println(" <userId>");
        printStream.println();
        printStream.print(OVERRIDE_CMD);
        printStream.println(" <config> <param> <value>");
        printStream.println("       Note: only works if no user spoofing");
        printStream.println();
        printStream.println(CLEAR_CMD);
    }

    public void dump(C69565No9 no9) {
        throw AnonymousClass7TE.A11("getStdout");
    }

    public static void clear() {
        0tS A00 = 0tS.A00();
        C69642NpP.A01 = null;
        A00.A0D((String) null);
    }
}
