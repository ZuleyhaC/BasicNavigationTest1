//Today is 12/12/2019
//    Morning:
//        git branches
//    Break
//    Afternoon:
//        last testng class
//        overview of our framework
//##############################################
//    Merge conflict - it's when multiple contributors (2 people) changed same file. To resolve conflict, we can do couple things:
//    1. Stash changes (if you didn't finish,and you cannot combine changes, stash your changes. In this case, you are not loosing changes forever.)
//    2. Discard your changes (you are loosing your changes forever)
//        either git checkout file or git reset --hard
//    3. Resolve conflict
//        first of all we have to commit our changes
//        then pull
//        And check conflicting files (fix manually or through other tools, like in intellij)
//        accept theirs changes
//        accept yours (your changes)
//        merge changes (compromise)
//        once conflict resolved, we can commit and push changes to github
//    4. Just clone project again and copy paster your changes (NO, but this is what people usually do)
//#####################################
//GIT BRANCHES
//What is branch? It's a one version of your project. With git, we can have multiple version of project that exist in parallel. Every branch can have independent commits history.
//Ideally, everyone works on their own branch, and then once work is done, you can create pull request to apply your changes to the main branch. This flow, allows to review code before accepting ant=y changes.
//Use a branch to isolate development work without affecting other branches in the repository.
//Each repository has one default branch, and can have multiple other branches.
//You can merge a branch into another branch using a pull request.
//git branch
//* master
//Master branch should have latest stable and confirmed code.
//Ideally, master branch shouldn't accept direct commits. Otherwise, changes can be committed without code review.
//In my project. test lead was review code. But if there is no team lead/test lead then we do peer review.
//Everyones code must go through review.
//But, test lead can decide/choose the flow.
//Every commit must be reviewed.
//Commit code when you completed some work.
//I would commit my changes, whenever I completed automation of some user story. Then I would add commit message like: "completed automation of VYT-4321 Driver should be able to add fuel logs". It's not only about scripts, you can also add utilities, fix something...
//The main idea is that we have to be careful with master branch.
//In my applications repository, not testing framework, we had a lot of branches:
//2.12 - versions of application
//2.13
//2.14
//2.15
//release
//master
//dev
//newfeature
//somedevolpers
//git branch name - to create a new branch
//then we run git branch to see list of branches
//  dev
//* master
//* means that we are still on the master branch
//How to switch to new branch?
//git checkout branch_name - to switch to different branch
//git checkout dev
//Switched to branch 'dev'
//git commit -a -m "" to add all files and commit, so you don't need to run git add src/ before commit
// git commit -a -m "added cars.txt"
//[dev 34444b9] added cars.txt
// 2 files changed, 16 insertions(+), 1 deletion(-)
// create mode 100644 cars.txt
// if you don't stage files (git add ) and miss -a, you will get "Nothing to commit"
//git log - to see history of commits.
//enter q to exit from log.
//-a -m   != -m -a : by Madina
//git branch
//  dev
//  *master
//git branch -d dev - to delete branch
//Deleted branch dev (was 6f0f888).
//git branch
//* master