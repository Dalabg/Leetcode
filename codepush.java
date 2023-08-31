package Coding_Caprice;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;
public class codepush {
    public static Git openRpo(String dir){
        Git git = null;
        try {
            Repository repository = new FileRepositoryBuilder()
                    .setGitDir(Paths.get(dir, ".git").toFile())
                    .build();
            git = new Git(repository);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return git;
    }
}

