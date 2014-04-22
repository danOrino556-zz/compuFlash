package com.trivia.compuflash.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class ActivityMain extends ActionBarActivity
{
    boolean cShown = false;
    boolean netShown = false;
    boolean testingShown = false;

    LinearLayout cLayout;
    LinearLayout netLayout;
    LinearLayout testingLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton backButton = (ImageButton)findViewById(R.id.backButtonDirectory);
        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                onBackPressed();
            }
        });

        Button cProgrammingButton = (Button)findViewById(R.id.cProgrammingButton);
        cProgrammingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(cShown == false)
                {
                    cLayout.setVisibility(View.VISIBLE);
                    cShown = true;
                }

                else if(cShown == true)
                {
                    cLayout.setVisibility(View.GONE);
                    cShown = false;
                }
            }
        });

        cLayout = (LinearLayout)findViewById(R.id.cLayout);


        Button cBasicsButton = (Button)findViewById(R.id.cBasicsButton);
        cBasicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "C Basics");
                extras.putString("website", "http://www.indiabix.com/technical/c/the-c-language-basics/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button cBitsButton = (Button)findViewById(R.id.cbitsAndBytesButton);
        cBitsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Bits and Bytes");
                extras.putString("website", "http://www.indiabix.com/technical/c/bits-and-bytes/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button cPreprocessorsButton = (Button)findViewById(R.id.cPreprocessorsButton);
        cPreprocessorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Preprocessors");
                extras.putString("website", "http://www.indiabix.com/technical/c/preprocessors/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button cArraysButton = (Button)findViewById(R.id.cArraysButton);
        cArraysButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Arrays");
                extras.putString("website", "http://www.indiabix.com/technical/c/arrays/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button cDataFilesButton = (Button)findViewById(R.id.cDataFilesButton);
        cDataFilesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Data Files");
                extras.putString("website", "http://www.indiabix.com/technical/c/data-files/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button cVariablesButton = (Button)findViewById(R.id.cVariablesButton);
        cVariablesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Variables and Data Storage");
                extras.putString("website", "http://www.indiabix.com/technical/c/variables-and-data-storage/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button cFunctionsButton = (Button)findViewById(R.id.cFunctionsButton);
        cFunctionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Functions");
                extras.putString("website", "http://www.indiabix.com/technical/c/functions/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button cStringsButton = (Button)findViewById(R.id.cStringsButton);
        cStringsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Strings");
                extras.putString("website", "http://www.indiabix.com/technical/c/strings/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button cPointersButton = (Button)findViewById(R.id.cPointersButton);
        cPointersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Pointers");
                extras.putString("website", "http://www.indiabix.com/technical/c/pointers/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button cStandardButton = (Button)findViewById(R.id.cStandardLibraryButton);
        cStandardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Standard Library Functions");
                extras.putString("website", "ww.indiabix.com/technical/c/standard-library-functions/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        cLayout.setVisibility(View.GONE);




        Button dataStructuresButton = (Button)findViewById(R.id.dataStructuresButton);
        dataStructuresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Data Structures");
                extras.putString("website", "http://www.indiabix.com/technical/data-structures/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netInterviewButton = (Button)findViewById(R.id.netInterviewButton);
        netInterviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(netShown == false)
                {
                    netLayout.setVisibility(View.VISIBLE);
                    netShown = true;
                }

                else if(netShown == true)
                {
                    netLayout.setVisibility(View.GONE);
                    netShown = false;
                }
            }
        });

        netLayout = (LinearLayout)findViewById(R.id.netLayout);

        Button netFrameworkButton = (Button)findViewById(R.id.netFrameworkButton);
        netFrameworkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Framework");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/dot-net-framework/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button objectOrientedButton = (Button)findViewById(R.id.netOOPButton);
        objectOrientedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Object-Oriented Programming");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/object-oriented-programming/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netADOButton = (Button)findViewById(R.id.netADOButton);
        netADOButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "ADO.NET");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/ado-dot-net/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netDynamicButton = (Button)findViewById(R.id.netDynamicButton);
        netDynamicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Dynamic Programming");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/dynamic-programming/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netASPButton = (Button)findViewById(R.id.netASPButton);
        netASPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "ASP.NET");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/asp-dot-net/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netWindowsWorkflowButton = (Button)findViewById(R.id.netWindowWorkflowButton);
        netWindowsWorkflowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Windows Workflow");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/windows-workflow-foundation/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netApplicationDeploymentButton = (Button)findViewById(R.id.netApplicationDeploymentButton);
        netApplicationDeploymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Application Deployment");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/application-deployment/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netCloudButton = (Button)findViewById(R.id.netCloudComputingButton);
        netCloudButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Cloud Computing");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/cloud-computing/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netProgrammingConceptsButton = (Button)findViewById(R.id.netProgrammingConceptsButton);
        netProgrammingConceptsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Programming Concepts");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/dot-net-programming-concepts/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netWindowsControlsButton = (Button)findViewById(R.id.netWindowsControlsButton);
        netWindowsControlsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Windows Controls");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/windows-controls/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netLINQButton = (Button)findViewById(R.id.netLINQButton);
        netLINQButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "LINQ");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/language-integrated-query-linq/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netXMLButton = (Button)findViewById(R.id.netXMLButton);
        netXMLButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "XML");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/xml/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netWebServicesButton = (Button)findViewById(R.id.netWebServicesButton);
        netWebServicesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Web Services");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/web-services/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netAJAXButton = (Button)findViewById(R.id.netAJAXButton);
        netAJAXButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "AJAX");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/asp-dot-net-ajax/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button netAssembliesButton = (Button)findViewById(R.id.netAssembliesButton);
        netAssembliesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", ".NET Assemblies");
                extras.putString("website", "http://www.indiabix.com/technical/dotnet/dot-net-assemblies/");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        netLayout.setVisibility(View.GONE);

        Button networkBasicsButton = (Button)findViewById(R.id.networkBasicsButton);
        networkBasicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Networks Basics");
                extras.putString("website", "http://www.indiabix.com/technical/networking/");
                extras.putString("singleFolder", "true");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button operatingSystemsButton = (Button)findViewById(R.id.operatingSystemButton);
        operatingSystemsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Operating Systems");
                extras.putString("website", "http://www.indiabix.com/technical/operating-systems/");
                extras.putString("singleFolder", "true");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button coreJavaButton = (Button)findViewById(R.id.coreJavaButton);
        coreJavaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Core Java");
                extras.putString("website", "http://www.indiabix.com/technical/core-java/");
                extras.putString("singleFolder", "true");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button javaBasicsButton = (Button)findViewById(R.id.basicJavaButton);
        javaBasicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Basic Java");
                extras.putString("website", "http://www.indiabix.com/technical/java-basics/");
                extras.putString("singleFolder", "true");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button javaAdvancedButton = (Button)findViewById(R.id.advancedJavaButton);
        javaAdvancedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Advanced Java");
                extras.putString("website", "http://www.indiabix.com/technical/advanced-java/");
                extras.putString("singleFolder", "true");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button databaseBasicsButton = (Button)findViewById(R.id.databaseBasicsButton);
        databaseBasicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Database Basics");
                extras.putString("website", "http://www.indiabix.com/technical/dbms-basics/");
                extras.putString("singleFolder", "true");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button databaseAdvancedButton = (Button)findViewById(R.id.databaseAdvancedButton);
        databaseAdvancedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Database Advanced");
                extras.putString("website", "http://www.indiabix.com/technical/dbms/");
                extras.putString("singleFolder", "true");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button sqlServerCoreButton = (Button)findViewById(R.id.sqlServerCoreButton);
        sqlServerCoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "SQL Server Core");
                extras.putString("website", "http://www.indiabix.com/technical/sql-server-general-questions/");
                extras.putString("singleFolder", "true");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button sqlServerBasicsButton = (Button)findViewById(R.id.sqlServerBasicsButton);
        sqlServerBasicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "SQL Server Basics");
                extras.putString("website", "http://www.indiabix.com/technical/sql-server-common-questions/");
                extras.putString("singleFolder", "true");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button sqlServerAdvancedButton = (Button)findViewById(R.id.sqlServerAdvancedButton);
        sqlServerAdvancedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "SQL Server Advanced");
                extras.putString("website", "http://www.indiabix.com/technical/sql-server-2008/");
                extras.putString("singleFolder", "true");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button unixFileManagementButton = (Button)findViewById(R.id.unixFileManagementButton);
        unixFileManagementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Unix File Management");
                extras.putString("website", "http://www.indiabix.com/technical/unix-file-managemnet/");
                extras.putString("singleFolder", "true");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button unixMemoryManagementButton = (Button)findViewById(R.id.unixMemoryManagementButton);
        unixMemoryManagementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Unix Memory Management");
                extras.putString("website", "http://www.indiabix.com/technical/unix-memory-management/");
                extras.putString("singleFolder", "true");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

        Button unixProcessManagementButton = (Button)findViewById(R.id.unixProcessManagementButton);
        unixProcessManagementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ActivityMain.this, ActivityFlashCard.class);
                Bundle extras = new Bundle();
                extras.putString("searchType", "Unix Process Management");
                extras.putString("website", "http://www.indiabix.com/technical/unix-process-management/");
                extras.putString("singleFolder", "true");
                i.putExtras(extras);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

    }


    @Override
    public void onBackPressed()
    {
        finish();
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
